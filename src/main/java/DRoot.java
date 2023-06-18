import java.util.List;
import java.util.LinkedList;

public class DRoot {

    //Digital root is the recursive sum of all the digits in a number.
    //
    //Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
    //   16  -->  1 + 6 = 7
    //   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
    //132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
    //493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2

    //Here will be implemented main method
    public static int digital_root(int n) {

        List<Integer> digitsList = intToDigitsList(n);
        int sum = 0;

        for (int digit : digitsList) {
            sum += digit;
        }
        //recursion escape
        if (sum - 9 <= 0){
            return sum;
        }

        return digital_root(sum);
    }

    //Method that takes int input and converts it into list of digits
    public static List<Integer> intToDigitsList(int number) {

        List<Integer> digitsList = new LinkedList<>();
        String numberString = Integer.toString(number);
        char[] numberCharArray = numberString.toCharArray();

        for (char charDigit : numberCharArray) {
            digitsList.add(Character.getNumericValue(charDigit));
        }
        return digitsList;
    }

    public static int digital_root2(int n) {
        return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }

}
