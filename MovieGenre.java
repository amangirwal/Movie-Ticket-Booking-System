
package cinematicketreservationsystem;


public class MovieGenre {

    private String Genre;

    MovieGenre(String genre) {

        this.Genre = genre;

    }

    public void SetGenre(String genre) {
        this.Genre = genre;

    }

    public String GetGenre() {

        return Genre;
    }

    @Override
    public String toString() {
        return Genre;
    }

}
