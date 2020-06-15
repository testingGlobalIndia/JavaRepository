package academy.learnprogramming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes");

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements");

        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " cube root of " + Math.cbrt(i));
        }


        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] str = sentence.split(" ");
        words.addAll(Arrays.asList(str));

        for(String word:words){
            System.out.println(word);
        }


    }
}
