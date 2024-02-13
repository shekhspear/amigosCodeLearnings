package functionalProgramming.advanced.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ChainingFunction {
    public static void main(String[] args) {
        //print a number and increment it by 1
        Function<Integer, Integer> combinedFunction =
        (incrementByOneFunction.andThen(multiplyBy10Function));
        System.out.println(combinedFunction.apply(3));
        System.out.println(incrementByOneAndMultiplyBy10Function.apply(3, 100));
    }
    static int incrementByOne(int number){
        return number + 1;
    }

    static Function<Integer, Integer> incrementByOneFunction = n -> n + 1;
    static Function<Integer, Integer> multiplyBy10Function = n -> n * 10;
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBy10Function = (n, m) -> (n + 1) * m;
}
