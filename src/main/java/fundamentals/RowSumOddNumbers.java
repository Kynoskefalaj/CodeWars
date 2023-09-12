package fundamentals;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

//Given the triangle of consecutive odd numbers:
//                        1
//                    3     5
//                7     9    11
//            13    15    17    19
//        21    23    25    27    29
//                    ...
//
//        Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)

public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        return n * n * n;
    }

    @Test
    public void test1() {
        Random rnd = new Random();
        for(int i=0;i<50;i++){
            int n = rnd.nextInt(500)+1;
            assertEquals((int) Math.pow(n,3), RowSumOddNumbers.rowSumOddNumbers(n));
        }
    }
}
