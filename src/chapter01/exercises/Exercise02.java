package chapter01.exercises;

import static java.lang.StringTemplate.STR;

public class Exercise02 {

    public static void main(String[] args) {
        String name = "Lisa";
        String position = "Park Manager";
        System.out.println(STR."My name is \{name} and I want to be a \{position} in Mesozoic Eden.");
    }
}
