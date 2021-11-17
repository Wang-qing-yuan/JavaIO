package com.Generics;

import java.util.Random;

public class FruitGenerator implements Generator<String> {
    String[] fruits = new String[]{"apple", "banana", "pear"};

    @Override
    public String next() {
        Random random = new Random();
        return fruits[random.nextInt(3)];
    }
}
