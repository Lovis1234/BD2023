package nl.belastingdienst.H5Methods;

public class Fibo {

    public long run(int n) {
        StringBuilder stringBuilder = new StringBuilder("1 1 ");
        int vorige1 = 1;
        int vorige2 = 1;
        stringBuilder.append(vorige1).append(" ").append(vorige2).append(" ");
        return loop(n, stringBuilder, vorige1, vorige2);
    }

    public long[] runArray(int n) {
        long[] nums = new long[n];
        nums[0] = 1;
        nums[1] = 1;
        int vorige1 = 1;
        int vorige2 = 1;
        return loopArray(n, nums, vorige1, vorige2);
    }

    public long run(int start, int n) {
        StringBuilder stringBuilder = new StringBuilder(start + " " + start + " ");
        return loop(n, stringBuilder, start, start);
    }

    public long run(int f1, int f2, int n) {
        StringBuilder stringBuilder = new StringBuilder(f1 + " " + f2 + " ");
        return loop(n, stringBuilder, f1, f2);
    }

    private long loop(int n, StringBuilder stringBuilder, long vorige1, long vorige2) {
        long huidig = 0;
        for (int i = n; i > 2; i--) {
            huidig = vorige1 + vorige2;
            stringBuilder.append(huidig).append(" ");
            vorige1 = vorige2;
            vorige2 = huidig;
        }
        System.out.println(stringBuilder);
        return huidig;
    }

    private long[] loopArray(int n, long[] nums, long vorige1, long vorige2) {
        long huidig = 0;
        for (int i = n; i > 2; i--) {
            huidig = vorige1 + vorige2;
            nums[i - 1] = i;
            vorige1 = vorige2;
            vorige2 = huidig;
        }
        return nums;
    }

    public float goldenRatio(int n) {
        return (float) run(n) / run(n - 1);
    }


}
