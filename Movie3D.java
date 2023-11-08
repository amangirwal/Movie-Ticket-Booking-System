
package cinematicketreservationsystem;


public class Movie3D extends Movie {

    public Movie3D(String mname, String mtime, int price, String g, String l, String re, double rt, int tnum, int snum) {
        super(mname, mtime, price, g, l, re, rt, tnum, snum);
    }

    @Override
    public String toString() {
        return (MovieName + " " + MovieTime);
    }

}
