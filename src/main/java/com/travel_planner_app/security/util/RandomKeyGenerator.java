package com.travel_planner_app.security.util;

import java.security.SecureRandom;
import java.util.Base64;

public class RandomKeyGenerator {

    public static String generateRandomKey() {
        SecureRandom random = new SecureRandom();
        byte[] key = new byte[64]; // 512 bits / 8 = 64 (1 byte = 8 bits)
        random.nextBytes(key);
        return Base64.getEncoder().encodeToString(key);
    }
}
