package fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import static org.junit.Assert.*;
import org.junit.Test;

public class TwoToOne {

    public static String longest(String s1, String s2) {

        String newStr = s1 + s2;
        HashSet<Character> set = new HashSet<>();

        for (char c : newStr.toCharArray()) {
            set.add(c);
        }

        ArrayList<Character> charList = new ArrayList<>(set);

        Collections.sort(charList);

        StringBuilder result = new StringBuilder();
        for (char c : charList) {
            result.append(c);
        }
        return result.toString();
    }

    @Test
    public void test() {
        System.out.println("longest Fixed Tests");
        assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
    }
}

