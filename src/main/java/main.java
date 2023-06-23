import java.lang.reflect.Array;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        System.out.println(DRoot.digital_root(1954556486));
        System.out.println(DRoot.digital_root2(1954556486));
        System.out.println(Square.isSquare(25));
        System.out.println(FindOdd.findIt(new int[] {1,2,3,4,5,4,3,2,1}));

        System.out.println(BinaryAddition.binaryAddition(1, 10));

        System.out.println(WhoLikesIt.whoLikesIt("John", "Sarah", "Michael", "Steve"));
        System.out.println(WhoLikesIt.whoLikesIt("John", "Sarah"));

        System.out.println(WhoLikesIt.whoLikesIt2("John", "Sarah", "Michael", "Steve"));
        System.out.println(WhoLikesIt.whoLikesIt2("John", "Sarah"));
        System.out.println(HumanReadableTime.makeReadable(867458565));
        System.out.println(HumanReadableTime.makeReadable2(458565));

        System.out.println(Scramblies.scramble("hakfdk2o2penom", "pokem22on"));
        System.out.println(Arrays.toString(TwoSum.twoSum(new int[] {1, 2, 4, 4}, 8)));
        System.out.println(Arrays.toString(TwoSum.twoSum(new int[] {2,3,1}, 4)));

    }
}
