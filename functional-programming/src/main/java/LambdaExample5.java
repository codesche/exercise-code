import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

// Predicate와 Function 사용
public class LambdaExample5 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Function<Integer, String> intToString = n -> "숫자: " + n;

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.stream()
            .filter(isEven)
            .map(intToString)
            .forEach(System.out::println);
    }
}
