package java8;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionINTF {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Function<List,Integer> f=nums-> nums.size();
        System.out.println(f.apply(numbers));
        Predicate<List> p=nums-> nums.isEmpty();
        System.out.println(p.test(numbers));

        Consumer<List> c1 = nums -> {
            for (Object num : nums) {
                System.out.println(num);
            }
        };
        c1.accept(numbers);


    }
}
