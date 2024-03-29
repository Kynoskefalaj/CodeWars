package fundamentals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindEvenIndex {
    public static int findEvenIndex(int[] arr) {

        int sumLeft;
        int sumRight;

        for (int i = 0; i < arr.length; i++) {
            sumLeft = 0;
            sumRight = 0;

            //SUM LEFT
            for (int j = 0; j < i; j++) {
                sumLeft += arr[j];
            }

            //SUM RIGHT
            for (int k = arr.length - 1; k > i; k--) {
                sumRight += arr[k];
            }

            if (sumLeft == sumRight) {
                return i;
            }
        }
        return -1;
    }

    @Test
    public void test() {
        assertEquals(3,FindEvenIndex.findEvenIndex(new int[] {1,2,3,4,3,2,1}));
        assertEquals(1,FindEvenIndex.findEvenIndex(new int[] {1,100,50,-51,1,1}));
        assertEquals(-1,FindEvenIndex.findEvenIndex(new int[] {1,2,3,4,5,6}));
        assertEquals(3,FindEvenIndex.findEvenIndex(new int[] {20,10,30,10,10,15,35}));
        assertEquals(-1,FindEvenIndex.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
        assertEquals(1,FindEvenIndex.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
        assertEquals(6,FindEvenIndex.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
        assertEquals(-1, FindEvenIndex.findEvenIndex(new int[] {8, 8}));
        assertEquals(0, FindEvenIndex.findEvenIndex(new int[] {8, 0}));
        assertEquals(1, FindEvenIndex.findEvenIndex(new int[] {0, 8}));
        assertEquals(0, FindEvenIndex.findEvenIndex(new int[] {7, 3, -3}));
        assertEquals(0, FindEvenIndex.findEvenIndex(new int[] {8}));
        assertEquals(0, FindEvenIndex.findEvenIndex(new int[] {0,0,0,0,0}));
    }
    // ----------------------
    private static int findEvenIndexSol(int[] arr)
    {
        int i, j; int leftsum, rightsum; int n = arr.length;
        for ( i = 0; i < n; ++i) {
            leftsum = 0; rightsum = 0;
            for ( j = 0; j < i; j++)
                leftsum  += arr[j];
            for( j = i+1; j < n; j++)
                rightsum += arr[j];
            if (leftsum == rightsum)
                return i;
        }
        return -1;
    }

    private static int randInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min)));
    }
    private static int addList(ArrayList<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }
    // start inclusive, end exclusive
    private static ArrayList<Integer> slice(ArrayList<Integer> list, int start, int end) {
        return new ArrayList<Integer>(list.subList(start, end));
    }
    private static ArrayList<Integer> doEx() {
        ArrayList<Integer> output = new ArrayList<Integer>();
        int tOrF = randInt(1,2);
        int rando = randInt(2, 500);
        int index = 0;
        for (int j = 0; j < rando; j++) {
            int x = randInt(-10000, 10000);
            output.add(x);
        }
        if(tOrF == 1) {
            index = randInt(1, output.size() - 1);
            ArrayList<Integer> list1 = slice(output, 0, index);
            ArrayList<Integer> list2 = slice(output, index + 1, output.size());
            int s1 = addList(list1);
            int s2 = addList(list2);
            output.add(s1 - s2);
        }
        return output;
    }
    @Test
    public void test1() {
        System.out.println("100 Random Tests");
        for (int i = 0; i < 100; i++) {
            ArrayList<Integer> a2 = doEx();
            int[] a3 = a2.stream().mapToInt(k -> k).toArray();
            assertEquals(findEvenIndexSol(a3), FindEvenIndex.findEvenIndex(a3));
        }
    }
}
