package fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrToInt {

    public static int strToInt(String str) {
        return Integer.valueOf(str);
    }

    @Test
    public void test1(){
        assertEquals(1234 , StrToInt.strToInt("1234"));
    }
    @Test
    public void test2(){
        assertEquals(605 , StrToInt.strToInt("605"));
    }
    @Test
    public void test3(){
        assertEquals(1405 , StrToInt.strToInt("1405"));
    }
    @Test
    public void test4(){
        assertEquals(-7 , StrToInt.strToInt("-7"));
    }
}
