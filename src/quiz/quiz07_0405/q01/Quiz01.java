package quiz.quiz07_0405.q01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Quiz01 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Developer", 5000),
                new Employee("Bob", "Developer", 6000),
                new Employee("Charlie", "Manager", 7000),
                new Employee("David", "Manager", 8000)
        );

        int totalSalary = employees.stream()
                .mapToInt(Employee::salary)
                .sum();

        Map<String, Double> salaryAvg = employees.stream()
                .collect(Collectors.groupingBy(Employee::role, Collectors.averagingDouble(Employee::salary)));

        System.out.println(String.format("■ 모든 직원의 총 급여 : %,d", totalSalary));
        salaryAvg.forEach((role, avg) -> System.out.println(String.format("■ %s 평균 급여 : %,.0f", role, avg)));
    }

    record Employee(String name, String role, int salary) {}
}
