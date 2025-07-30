import java.util.Arrays;
import java.util.List;

// 리스트 정렬 (Comparator + 람다식)
public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kim", "Lee", "Park", "Choi");

        // 이름 길이순 정렬 (람다식 사용)
        names.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        names.forEach(System.out::println);
    }
}
