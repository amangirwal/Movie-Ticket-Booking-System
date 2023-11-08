
package cinematicketreservationsystem;


public class MovieRating {

    private double rating;

    MovieRating(double rating) {
        this.rating = rating;
    }

    public void SetRating(double rating) {
        this.rating = rating;

    }

    public double GetRating() {

        return this.rating;
    }

    @Override
    public String toString() {
        Double i = this.rating;
        return i.toString();
    }

}
