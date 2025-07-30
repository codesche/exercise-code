import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample4 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList(" apple ", " Banana ", "PEACH ", "  kiwi");

        // 대문자로 변환 후 공백 제거 후 정렬
        List<String> result = input.stream()
            .map(String::trim)
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());

        System.out.println(result);
    }
}
