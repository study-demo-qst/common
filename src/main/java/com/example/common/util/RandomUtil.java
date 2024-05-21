package com.example.common.util;

import java.util.Random;
import java.util.stream.Collectors;

public class RandomUtil {
    private static final Random RANDOM = new Random();
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static int randomInt(int min, int max) {
        return RANDOM.nextInt(max - min + 1) + min;
    }

    public static double randomDouble() {
        return RANDOM.nextDouble();
    }

    public static boolean randomBoolean() {
        return RANDOM.nextBoolean();
    }

    public static String randomString(int length) {
        return RANDOM.ints(length, 0, CHARACTERS.length())
                .mapToObj(CHARACTERS::charAt)
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}