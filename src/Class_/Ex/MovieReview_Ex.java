package Class_.Ex;

public class MovieReview_Ex {
    public static void main(String[] args) {

        MovieReview movie1 = new MovieReview();
        movie1.title = "인턴";
        movie1.review = "인생 영화다!";

        MovieReview movie2 = new MovieReview();
        movie2.title = "유잼";
        movie2.review = "재밌다!";

        MovieReview movie3 = new MovieReview();
        movie3.title = "노잼";
        movie3.review = "재미없다!";

        MovieReview[] movies = new MovieReview[3];
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
