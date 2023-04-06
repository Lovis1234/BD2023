package nl.belastingdienst.H10Inheritance.SoundExtra;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SoundEffects implements ActionListener {
    private JPanel rootPane;
    private JButton buttonApply;
    private JTextPane textPane1;
    private JPanel OptionPanel;
    private JTextField textField1;
    private JLabel nameLabel;
    private JCheckBox checkBoxDeformation;
    private JCheckBox checkBoxDistortion;
    private SoundModule soundModule;
    private JCheckBox jCheckBox;

    private boolean intitialized = false;

    public SoundEffects(SoundModule soundModule) {
        checkBoxDeformation.setText("Deformation");
        checkBoxDistortion.setText("Distortion");
        nameLabel.setText("Input song name: ");
        buttonApply.addActionListener(this);
        checkBoxDeformation.setVisible(false);
        checkBoxDistortion.setVisible(false);
        buttonApply.setText("Choose song");
        this.soundModule = soundModule;
    }

    public JPanel getRootPane() {
        return rootPane;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonApply) {
            if (!intitialized) {
                if (!textField1.getText().isEmpty() && !textPane1.getText().isEmpty()) {
                    soundModule.addSongToList(new Song(textField1.getText(), textPane1.getText()));
                    textPane1.setText(soundModule.playSong(textField1.getText()));
                    textField1.setEditable(false);
                    textPane1.setEditable(false);
                    intitialized = true;
                    checkBoxDeformation.setVisible(true);
                    checkBoxDistortion.setVisible(true);
                    buttonApply.setText("Apply effect");
                } else textPane1.setText("Choose a song name and song lyrics");
            }
            if (intitialized) {
                soundModule.setEffectList(new ArrayList<>());
                if (checkBoxDistortion.isSelected()) {
                    soundModule.addEffectToList(Distortion.getInstance());

                }
                if (checkBoxDeformation.isSelected()) {
                    soundModule.addEffectToList(Deformation.getInstance());
                }
                soundModule.addEffectsToSong(textField1.getText(), soundModule.getEffectList());
                textPane1.setText(soundModule.playSong(textField1.getText()));
            }
        }
    }

    private void createUIComponents() {
        jCheckBox = new JCheckBox("test");
        jCheckBox.setVisible(true);
        OptionPanel.add(jCheckBox);
//        soundModule.getEffectList().forEach(a -> jCheckBox.add(new JCheckBoxMenuItem(a.toString())));
    }
}
