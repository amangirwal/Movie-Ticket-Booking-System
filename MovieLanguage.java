
package cinematicketreservationsystem;


public class MovieLanguage {

    private String lang;

    MovieLanguage(String lang) {
        this.lang = lang;
    }

    public void SetGenre(String lang) {
        this.lang = lang;

    }

    public String GetGenre() {

        return lang;
    }

    @Override
    public String toString() {
        return lang;
    }

}
