package com.first;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.Function;
/**
 * Question 5: Implement the following functional interfaces from java.util.function
 * using lambdas:
 * Consumer
 * Supplier
 * Predicate
 * Function
 */

public class FifthQuestion {
    public static void main(String[] args) {
        // Consumer
        Consumer<Integer> consumer = myInteger -> System.out.println("Adding 2 to 6: " + (myInteger + 2));
        consumer.accept(6);

        // Supplier
        Supplier<Integer> supplier = () -> 4 * 2;
        System.out.println("2 multiplied by 4: " + supplier.get());

        // Predicate
        Predicate<Integer> predicate = integer -> integer % 2 == 0;
        System.out.println("Is 6 even? " + predicate.test(6));

        // Function
        Function<String, Integer> function = myString -> myString.length();
        System.out.println("Length of 'Saurabh': " + function.apply("Saurabh"));
    }
}
