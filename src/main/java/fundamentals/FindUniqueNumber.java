package fundamentals;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindUniqueNumber {
    public static double findUniqueNumber(double arr[]) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] == arr[0]) {
                        return arr[i];
                    } else {
                        return arr[0];
                    }
                }
            }
        } return 0;
    }

    private double precision = 0.0000000000001;

    @Test
    public void sampleTestCases() {
        assertEquals(1.0, FindUniqueNumber.
                findUniqueNumber(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, FindUniqueNumber.
                findUniqueNumber(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }
}
