package Class_.Ex;

public class Ex01_MovieReview {
    public static void main(String[] args) {

        Class01_MovieReview movie1 = new Class01_MovieReview();
        movie1.title = "인턴";
        movie1.review = "인생 영화다!";

        Class01_MovieReview movie2 = new Class01_MovieReview();
        movie2.title = "유잼";
        movie2.review = "재밌다!";

        Class01_MovieReview movie3 = new Class01_MovieReview();
        movie3.title = "노잼";
        movie3.review = "재미없다!";

        Class01_MovieReview[] movies = new Class01_MovieReview[3];
        movies[0] = movie1;
        movies[1] = movie2;
        movies[2] = movie3;

        System.out.println("=======================");
        for (int i = 0; i < movies.length; i++) {
            System.out.println("영화 제목 : " + movies[i].title + "\n영화 리뷰 : " + movies[i].review);
            System.out.println("=======================");
        }
    }
}
