package dev.iqux.vina.utils;

public class Random {

    public static boolean canSuccess(Double rate) {
        rate *= 100;

        if (rate >= random_int(1, 10000)) {
            return true;
        }

        return false;
    }

    public static int random_int(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}