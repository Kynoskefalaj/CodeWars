import java.util.HashMap;

public class FindOdd {
    public static int findIt(int[] a) {
        //Do Hash Map where number will be key and numbers of occurance will be value
        HashMap<Integer, Integer> numOccur = new HashMap<Integer, Integer>();

        for (int n : a) {
            if (numOccur.containsKey(n)) {
                int newOccurance = numOccur.get(n) + 1;
                numOccur.put(n, newOccurance);
            } else {
                numOccur.put(n, 1);
            }
        }
        for (int i : numOccur.keySet()) {
            if (numOccur.get(i) % 2 != 0) {
                return i;
            }
        }
        return 0;
    }
}