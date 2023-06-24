public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int x = 0;
        int y = 0;

        for (char direction : walk){
            switch (direction) {
                case 'n' : y += 1; break;
                case 's' : y -= 1; break;
                case 'e' : x += 1; break;
                case 'w' : x -= 1; break;
            }
        }
        return walk.length == 10 && x == 0 && y == 0;
    }
}