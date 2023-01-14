public class Movie {
    String title;
    String studio;
    String rating;

    public Movie() {
        title = "";
        studio = "";
        rating = "";
    }
    @Override
    public String toString() {
        return String.format("title: %s,studio: %s,rating:,", title, studio, rating);
    }
}
