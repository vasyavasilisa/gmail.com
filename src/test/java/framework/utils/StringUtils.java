package framework.utils;

import java.util.Random;

public class StringUtils {

    private StringUtils() {
    }

    public static String generateRandomText(int length) {
        String chars = "ABCDEFGHIJKLMNOPURSTUVWXYSabcdefghijklmnopurstuvwxyz";
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < length; ++i) {
            int index = new Random().nextInt(chars.length());
            result.append(chars, index, index + 1);
        }
        return result.toString();
    }
}