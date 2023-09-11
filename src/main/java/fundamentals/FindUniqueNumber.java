package fundamentals;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FindUniqueNumber {
    public static double findUniqueNumber(double arr[]) {

        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
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
