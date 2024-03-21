package stream.ex;

import java.util.*;
import java.util.stream.Collectors;

public class Ex14 {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Java의 정석", "컴퓨터 과학", "남궁성", 2013, 1024),
                new Book("모비 딕", "소설", "허먼 멜빌", 1851, 635),
                new Book("클린 코드", "컴퓨터 과학", "로버트 C. 마틴", 2008, 464),
                new Book("햄릿", "연극", "윌리엄 셰익스피어", 1603, 500),
                new Book("데미안", "소설", "헤르만 헤세", 1919, 248),
                new Book("Effective Java", "컴퓨터 과학", "조슈아 블로크", 2018, 412)
        );

        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                1. 모든 책의 평균 페이지 수 계산
                2. 특정 장르 책의 평균 출판년도 계산
                3. 특정 연도 이후 출판된, 최소 페이지 이상 책의 제목 출력
                4. 각 장르별 책의 수 계산
                5. 가장 많은 책이 출판된 장르 찾기
                0. 종료
                """);

        while (true) {

            try {

                System.out.println();
                System.out.print("실행할 작업의 번호를 입력해 주세요 : ");
                int number = scanner.nextInt();

                validateNumber(number);

                switch (number) {
                    case 1 :
                        double pagesAvg = books.stream()
                                .mapToInt(Book::pages)
                                .average().orElse(Double.NaN);
                        System.out.println("♬ 모든 책의 평균 페이지 수 : %,.0f 페이지".formatted(pagesAvg));
                        break;
                    case 2 :
                        System.out.print("평균 출판연도를 계산할 장르를 입력하세요 : ");
                        String genre = scanner.next();
                        specificGenrePublishYear(genre);
                        break;
                    case 3 :
                        System.out.print("조회할 최소 연도를 입력하세요 : ");
                        int minYear = scanner.nextInt();
                        System.out.print("조회할 최소 페이지 수를 입력하세요 : ");
                        int minPage = scanner.nextInt();

                        List<Book> list = books.stream()
                                .filter(book -> book.publishYear >= minYear)
                                .filter(book -> book.pages >= minPage)
                                .sorted(Comparator.comparing(Book::title))
                                .toList();
                        list.forEach(book -> System.out.println("♬ 책 제목 : \"" + book.title + "\"(페이지 수 : " + book.pages + " 페이지)"));
                        break;
                    case 4 :
                        Map<String, Long> collect = books.stream()
                                .collect(Collectors.groupingBy(Book::genre, Collectors.counting()));
                        collect.forEach((g, p) -> System.out.println("♬ 장르 : %s | 보유 권수 : %d권".formatted(g, p)));
                        break;
                    case 5 :
                        break;
                    case 0 :
                        System.out.println("프로그램을 종료합니다.");
                        return;
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 다시 시도해 주시기를 바랍니다.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public record Book(String title, String genre, String author, int publishYear, int pages) {}

    public static void specificGenrePublishYear(String genre) {

        List<Book> books = Arrays.asList(
                new Book("Java의 정석", "컴퓨터 과학", "남궁성", 2013, 1024),
                new Book("모비 딕", "소설", "허먼 멜빌", 1851, 635),
                new Book("클린 코드", "컴퓨터 과학", "로버트 C. 마틴", 2008, 464),
                new Book("햄릿", "연극", "윌리엄 셰익스피어", 1603, 500),
                new Book("데미안", "소설", "헤르만 헤세", 1919, 248),
                new Book("Effective Java", "컴퓨터 과학", "조슈아 블로크", 2018, 412)
        );

        Map<String, Double> genrePublishYear = books.stream()
                .collect(Collectors.groupingBy(Book::genre, Collectors.averagingDouble(Book::publishYear)));

        switch (genre) {

            case "컴퓨터 과학" :
                Double publishYearAvg1 = genrePublishYear.get("컴퓨터 과학");
                System.out.println(String.format("♬ [컴퓨터 과학] 평균 출판연도 : %.0f년", publishYearAvg1));
                break;
            case "소설" :
                Double publishYearAvg2 = genrePublishYear.get("소설");
                System.out.println(String.format("♬ [소설] 평균 출판연도 : %.0f년", publishYearAvg2));
                break;
            case "연극" :
                Double publishYearAvg3 = genrePublishYear.get("연극");
                System.out.println(String.format("♬ [연극] 평균 출판연도 : %.0f년", publishYearAvg3));
                break;
        }
    }

    public static void validateNumber(int number) {

        StringBuilder exceptionMessage = new StringBuilder();

        if (number < 0 || number > 5) {
            exceptionMessage.append("번호를 확인 후 다시 입력해 주시기를 바랍니다.");
        }

        if (!exceptionMessage.isEmpty()) {
            throw new IllegalArgumentException(exceptionMessage.toString());
        }
    }
}
