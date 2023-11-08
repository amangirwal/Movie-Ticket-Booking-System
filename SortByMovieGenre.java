
package cinematicketreservationsystem;

import java.util.Comparator;


public class SortByMovieGenre implements Comparator<MovieGenre> {

    @Override
    public int compare(MovieGenre o1, MovieGenre o2) {
        int ret = o1.GetGenre().compareTo(o2.GetGenre());
        return ret;

//     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
