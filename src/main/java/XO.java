public class XO {

    public static boolean getXO (String str) {

        char[] xoArr = str.toCharArray();
        int xQty = 0;
        int oQty = 0;

        for (int i = 0; i < xoArr.length; i++) {
            if (Character.toLowerCase(xoArr[i]) == 'x') {
                xQty++;
            } else if (Character.toLowerCase(xoArr[i]) == 'o'){
                oQty++;
            }
        }
        return (xQty == oQty) ? true : false;
    }
}
//Check to see if a string has the same amount of 'x's and 'o's. The method must
// return a boolean and be case insensitive. The string can contain any char.