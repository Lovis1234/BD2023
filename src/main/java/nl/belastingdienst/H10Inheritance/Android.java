package nl.belastingdienst.H10Inheritance;

public class Android extends Human implements Chargeable {
    int level = 0;

    @Override
    public String greet() {
        return "I'm only half human, but human still.. My energy level is " + level + "%.";
    }

    @Override
    public int charge(int amount) {
        if (!(level + amount > 100)) {
            level += amount;
        }
        return level;
    }
}
