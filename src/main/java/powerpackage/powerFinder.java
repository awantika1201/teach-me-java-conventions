package powerpackage;

public class powerFinder {


    public static int findPow(int base, int pow) {
        int num = 1;
        num = getPower(base, pow, num);
        return num;
    }

    private static int getPower(int base, int pow, int num) {
        for (int i = 0; i< pow; i++) {
            num *= base;
        }
        return num;
    }
}
