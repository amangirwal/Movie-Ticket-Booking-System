
package cinematicketreservationsystem;

import java.util.Comparator;


public class SortByMoviePrice implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {

        return Integer.compare(o1.GetMoviePrice(), o2.GetMoviePrice());
    }

}
