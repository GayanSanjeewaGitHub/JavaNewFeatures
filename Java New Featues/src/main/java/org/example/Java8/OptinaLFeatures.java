package org.example.Java8;

import java.util.Optional;

public class OptinaLFeatures {
    public static void main(String[] args) {
        String[] words = new String[10];
        Optional<String> checkNull = Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        } else System.out.println("word is null");

        String[] str = new String[5];
        str[2] = "value put here";
        Optional<String> value = Optional.of(str[2]);
        System.out.println(value.get());
        System.out.println(value.hashCode());
        System.out.println(value.isPresent());


    }
}
