package java8;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class SupplierINTF {
    public static void main(String[] args) {
        // Supplier that returns a fixed String
        Supplier<String> greetingSupplier = () -> {
            return "Hello, World!";
        };

        // Get the value from the Supplier
        String greeting = greetingSupplier.get();
        System.out.println(greeting); // Output: Hello, World!

        // Supplier that returns a random number
        Supplier<Double> randomNumberSupplier = () -> Math.random();

        // Get random numbers
        System.out.println(randomNumberSupplier.get()); // Output: e.g., 0.723942837
        System.out.println(randomNumberSupplier.get()); // Output: e.g., 0.189374923

        //ONE simple boolean example
        Supplier<Boolean> BoolExample = () -> greetingSupplier.get().equals("Hello");
        System.out.println(BoolExample.get());
    }
}
