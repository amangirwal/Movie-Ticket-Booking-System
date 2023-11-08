
package cinematicketreservationsystem;

import java.util.Comparator;


public class SortByMovieRating implements Comparator<MovieRating> {

    @Override
    public int compare(MovieRating o1, MovieRating o2) {

        return Double.compare(o1.GetRating(), o2.GetRating());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
