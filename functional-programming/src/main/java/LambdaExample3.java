import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

// 사용자 정의 객체 정렬
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class LambdaExample3 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        );

        // 나이순 정렬
//        people.sort(Comparator.comparingInt(p -> p.age));

        // 이름순 정렬
        people.sort(Comparator.comparing(p -> p.name));

        people.forEach(p -> System.out.println(p.name + " (" + p.age + ")"));

        System.out.println("==========================================");

        // 특정 조건 필터링 후 매핑
        List<Person> adults = people.stream()
            .filter(p -> p.age >= 30)
            .collect(Collectors.toList());

        adults.forEach(p -> System.out.println(p.name));

        System.out.println("==========================================");

        // 나이 기준으로 그룹화
        Map<Integer, List<Person>> groupedByAge = people.stream()
            .collect(Collectors.groupingBy(p -> p.age));

        groupedByAge.forEach((age, list) -> {
            System.out.print(age + "세: ");
            list.forEach(p -> System.out.println(" " + p.name));
        });

        System.out.println("==========================================");

        // 평균, 최대값, 최소값 구하기
        Double averAge = people.stream()
            .collect(Collectors.averagingInt(p -> p.age));

        Optional<Person> oldest = people.stream()
            .max(Comparator.comparingInt(p -> p.age));

        System.out.println("평균 나이: " + averAge);
        oldest.ifPresent(p -> System.out.println("가장 나이 많은 사람: " + p.name));
    }
}
