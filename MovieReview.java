
package cinematicketreservationsystem;


public class MovieReview {

    private String Review;

    MovieReview(String review) {
        this.Review = review;
    }

    public void SetReview(String review) {
        this.Review = review;

    }

    public String GetReview() {

        return this.Review;
    }

    @Override
    public String toString() {
        return Review;
    }

}
