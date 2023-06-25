//You are given an array (which will have a length of at least 3, but could
// be very large) containing integers. The array is either entirely comprised
// of odd integers or entirely comprised of even integers except for a single
// integer N. Write a method that takes the array as an argument and returns
// this "outlier" N.

import java.util.LinkedList;

public class FindOutlier{
    static int find(int[] integers){

        LinkedList<Integer> odd = new LinkedList<Integer>();
        LinkedList<Integer> even = new LinkedList<Integer>();

        for (int n : integers) {
            if (n % 2 != 0) {
                odd.add(n);
            } else {
                even.add(n);
            }
        }

        if (odd.size() == 1){
            return odd.getFirst();
        } else {
            return even.getFirst();
        }
    }
}