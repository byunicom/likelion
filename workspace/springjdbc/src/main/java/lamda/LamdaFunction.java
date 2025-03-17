package lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LamdaFunction {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Function<Integer, Integer> squareFunction = number -> number*number;
        List<Integer> squaredNumbers = numbers.stream().map(squareFunction).collect(Collectors.toList());
        System.out.println(squaredNumbers);
    }
}
