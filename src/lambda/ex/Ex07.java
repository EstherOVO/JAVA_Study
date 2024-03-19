package lambda.ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex07 {
    public static void main(String[] args) {

/*
        연습문제 7. 직원 필터링

        요구사항 : List<Employee>에서 연봉(salary)이 50,000 이상인 직원만 필터링하여
        그 이름을 출력하세요. Predicate와 Consumer를 사용하여 구현하세요.
        Employee 클래스는 이름(name)과 연봉(salary) 필드를 가집니다.

        입력 데이터
        List<Employee> employees = Arrays.asList(new Employee("둘리", 70000), new Employee("희동", 40000), new Employee("마이클", 80000));
*/

        List<Employee> employees = Arrays.asList(new Employee("둘리", 70000), new Employee("희동", 40000), new Employee("마이클", 80000));

        Consumer<Employee> getNames = employee -> System.out.println("- " + employee.getName());

        System.out.println("연봉 50,000 이상 직원 : ");
        Predicate<Employee> isHighestPaidPerson = employee -> employee.getSalary() > 50000;
        for (Employee employee : employees) {
            if (isHighestPaidPerson.test(employee)) {
                getNames.accept(employee);
            }
        }

//      람다식을 사용하지 않는다면...
        for (Employee employee : employees) {
            if (employee.getSalary() > 50000) {
                System.out.println(employee.getName());
            }
        }

//      람다식을 사용하는 이유는 스트림 API를 함께 사용하기 위해!
        employees.  // 컬렉션 프레임워크에서(자료 리스트)
                stream().   // 데이터 흐름을 만들어서
                filter(isHighestPaidPerson). // 필요한 데이터를 걸러서(연봉 50,000 이상)
                forEach(getNames);           // 출력해라.

    }

    public static class Employee {

        private String name;
        private long salary;

        public Employee(String name, long salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public long getSalary() {
            return salary;
        }
    }
}
