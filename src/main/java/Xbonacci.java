import java.util.Arrays;

public class Xbonacci {

    public static double[] tribonacci(double[] s, int n) {

        int len = 0;
        if (n == 0) {
            return new double[]{};
        } else if (n < 3) {
            len = n;
        } else {
            len = 3;
        }

        double[] list = new double[n];
        System.arraycopy(s, 0, list, 0, len);

        double next = 0;
        for (int i = 0; i < n - 1; i++) {
            if (i >= 2) {
                next = list[i] + list[i - 1] + list[i - 2];
                list[i + 1] = next;
            } else {
                continue;
            }
        }
        return list;
    }

    public static double[] tribonacci2(double[] s, int n) {

        double[] tritab= Arrays.copyOf(s, n);
        for(int i=3;i<n;i++){
            tritab[i]=tritab[i-1]+tritab[i-2]+tritab[i-3];
        }
        return tritab;

    }
}