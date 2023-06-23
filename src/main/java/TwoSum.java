public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1){
                for (int j = i+1; j < numbers.length; j++) {
                    if (numbers[i] + numbers[j] == target) {
                        indices[0] = i;
                        indices[1] = j;
                    }
                }
            }
        }
        return indices;
    }
}
