
package cinematicketreservationsystem;

import java.util.Comparator;


public class SortByMovieName implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        int ret = o1.GetMovieName().compareTo(o2.GetMovieName());
        return ret;

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
