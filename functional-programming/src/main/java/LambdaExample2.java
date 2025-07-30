import java.util.Arrays;
import java.util.List;

// 숫자 리스트 필터링 및 합산 (Stream + filter + reduce)
public class LambdaExample2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
            .filter(n -> n % 2 == 0)
            .reduce(0, Integer::sum);

        System.out.println("짝수의 합: " + sum);
    }
}
