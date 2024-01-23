package streamUdemy;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FP03FunctionalInterfaces {

    @SuppressWarnings("unused")
    public static void main(String[] args){
        List<Integer> numbers=List.of(12,7,33,4,8,3,1,15);

        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;

        Function<Integer, Integer> squareFunction = x -> x * x;

        Function<Integer,String> stringOutputFunction = x -> x + " ";

        Consumer<Integer> sysoutConsumer = System.out::println;

        BinaryOperator<Integer> sumBinaryOperator = (x,y) -> x + y;

        //no input > return something
        Supplier<Integer> randomIntegerSupplier=() -> {
            Random random=new Random();
            return random.nextInt(1000);
        };

        System.out.println(randomIntegerSupplier.get());

        UnaryOperator<Integer> unaryOperator=x ->3 * x;

        System.out.println(unaryOperator.apply(10));

        BiPredicate<Integer, String> biPredicate = (number, str) -> {
            return  number<10 && str.length()>5;
        };

        System.out.println(biPredicate.test(15,"eertdfs32r"));

        BiFunction<Integer,String, String> biFunction=(number, str) -> {
            return number + " " + str;
        };

        System.out.println(biFunction.apply(15,"sdfsfwefds"));


    }
}
