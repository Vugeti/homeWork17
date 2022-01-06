package functionalIntaraice;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        IntPredicate predicate = number -> {
            for (int i = 2; i < number; i++) {
                return false;
            }
            return (number > 1);
        };
        System.out.println("IntPredicate: " + predicate.test(6));

        Consumer<Integer> consumer = randomNum -> System.out.println("Consumer: " + randomNum);
        consumer.accept(new Random().nextInt(6) + 1);

        Supplier<String> dayOfWeekSupplier = () -> {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
            return dateFormat.format(date);
        };
        System.out.println("Supplier: " + dayOfWeekSupplier.get());

        Function<Double, Long> convert = num -> Math.round(num);
        System.out.println("Function: " + convert.apply(4.8));

        UnaryOperator<Integer> unaryOperator = fibonacciNum -> {
            int n3 = 0;
            int n1 = 1;
            for (int i = 2; i <= fibonacciNum; ++i) {
                int n2 = n3 + n1;
                n3 = n1;
                n1 = n2;
            }
            return n1;
        };
        System.out.println("UnaryOperator: " + unaryOperator.apply(7));      //fibonacciNum (0,1,1,2,3,5,8,13,21,34,55....)
    }
}
