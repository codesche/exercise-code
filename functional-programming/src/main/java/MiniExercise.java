import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

// 사원 목록에서 특정 부서의 평균 급여 구하기
class Employee {
    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class MiniExercise {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Kim", "HR", 4000),
            new Employee("Lee", "Dev", 5000),
            new Employee("Park", "Dev", 6000),
            new Employee("Choi", "HR", 4500)
        );

        // 부서별 평균 연봉
        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(
                e -> e.department,
                Collectors.averagingInt(e -> e.salary)
            ));

        avgSalaryByDept.forEach((dept, avg) ->
            System.out.println(dept + " 부서 평균 급여: " + avg));

        System.out.println("================================================");

        // 사원 목록에서 가장 연봉이 높은 사원 찾기
        Optional<Employee> topPaid = employees.stream()
            .max(Comparator.comparingInt(e -> e.salary));

        topPaid.ifPresent(e -> System.out.println("최고 연봉자: " + e.name + " (" + e.salary + ")"));
    }
}
