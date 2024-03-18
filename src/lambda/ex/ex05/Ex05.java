package lambda.ex.ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex05 {
    public static void main(String[] args) {

        List<Person> attendees = Arrays.asList(
                new Person("둘리", 22),
                new Person("희동이", 3),
                new Person("마이콜", 25),
                new Person("영희", 16)
        );

        Consumer<Person> welcome = person -> System.out.println("환영합니다. " + person.getName() + "님!");
        attendees.forEach(welcome);

        Predicate<Person> isAdult = person -> person.getAge() >= 18;
        System.out.println("18세 이상 : ");
        for (Person attendee : attendees) {
            if (isAdult.test(attendee)) {
                System.out.println(attendee.getName());
            }
        }

        System.out.println("전체 명단 : ");
        Function<Person, String> names = Person::getName;
        attendees.forEach((attendee) -> System.out.println(names.apply(attendee)));

        Supplier<List<String>> inviteListSupplier = ArrayList::new;
        List<String> inviteList = inviteListSupplier.get();

        System.out.println("초대된 명단 : ");
        for (Person attendee : attendees) {
            if (isAdult.test(attendee)) {
                inviteList.add(names.apply(attendee));
                System.out.println(names.apply(attendee));
            }
        }
    }
}
