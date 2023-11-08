
package cinematicketreservationsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {

    private int cinemaNumber;

    Scanner scanner = new Scanner(System.in);

    private ArrayList<Movie> AllMovies = new ArrayList();

    public Cinema(int c) {
        cinemaNumber = c;
    }

    public Cinema() {

    }

    public void AddMovie() {

        Movie e = null;
        System.out.println("Enter movie name:");
        String name = scanner.nextLine();
        System.out.println("Enter movie timings");
        String time = scanner.nextLine();
        System.out.println("Enter ticket price for movie");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter movie genre");
        String genre = scanner.nextLine();
        System.out.println("Enter movie language");
        String language = scanner.nextLine();
        System.out.println("Enter movie review");
        String review = scanner.nextLine();
        System.out.println("Enter movie rating (out of 10)");
        double rating = scanner.nextDouble();
        System.out.println("Enter number of tickets for movie");
        int tickets = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter movie type(1 for 2D/2 for 3D)");
        int i = scanner.nextInt();
        scanner.nextLine();
        if (i == 1) {
            e = new Movie2D(name, time, price, genre, language, review, rating, tickets, tickets);
        }
        if (i == 2) {
            e = new Movie3D(name, time, price, genre, language, review, rating, tickets, tickets);
        }
        AllMovies.add(e);

    }

    public void ShowMovies() {
        AllMovies.add(new Movie("chintaraman", "10:30-11:45", 100, "Action", "Hindi", "V Good movie", 8.7, 10, 10));
        AllMovies.add(new Movie("Ek Vivah", "8:00-10:00", 100, "Action", "Hindi", "V Good movie", 8.7, 10, 10));
        AllMovies.add(new Movie("Bateman", "12:00-3:00", 450, "Action", "English", "V Good movie", 8.7, 10, 10));
        AllMovies.add(new Movie("Avengers", "8:00-10:00", 500, "Action", "English", "V Good movie", 8.7, 10, 10));
        AllMovies.add(new Movie("Your Name", "10:30-11:45", 300, "Action", "English", "V Good movie", 8.7, 10, 10));
        AllMovies.add(new Movie("Jujutsu Kaisen", "8:00-10:00", 500, "Action", "English", "V Good movie", 8.7, 10, 10));
        AllMovies.add(new Movie("Naruto", "10:30-11:45", 200, "Action", "English", "V Good movie", 8.7, 10, 10));
        AllMovies.add(new Movie("JOKER", "8:00-10:00", 600, "Action", "English", "V Good movie", 8.7, 10, 10));
        AllMovies.add(new Movie("TITANIC", "10:30-11:45", 500, "Action", "English", "V Good movie", 8.7, 10, 10));

        System.out.println("Press 1 to view movies by price");
        System.out.println("Press 2 to view movies by Genre");
        System.out.println("Press 3 to view movies by Language");
        System.out.println("Press 4 to view movies by Name");
        int i = scanner.nextInt();
        scanner.nextLine();
        if (i == 1) {
            System.out.println("Press \"movie name\", \"Time Slot\", Price");
            System.out.println("1 for \"chintaraman\", \"10:30-11:45\", 100,");
            System.out.println("2 for \"Jujutsu Kaisen\", \"8:00-10:00\", 500");
            System.out.println("3 for \"Bateman\", \"12:00-3:00\", 450,");
            System.out.println("4 for \"Avengers\", \"8:00-10:00\", 500,");
            System.out.println("5 for \"Your Name\", \"10:30-11:45\", 300,");
            System.out.println("6 for \"Ek Vivah\", \"8:00-10:00\", 100,");
            System.out.println("7 for \"Naruto\", \"10:30-11:45\", 200,");
            System.out.println("8 for \"JOKER\", \"8:00-10:00\", 600, ");
            System.out.println("9 for \"TITANIC\", \"10:30-11:45\", 500,");


        } else if (i == 2) {
            System.out.println("Press \"movie name\", \"Time Slot\" Genre");
            System.out.println("1 for \"chintaraman\", \"10:30-11:45\"Action");
            System.out.println("2 for \"Jujutsu Kaisen\", \"8:00-10:00\", Action");
            System.out.println("3 for \"Bateman\", \"12:00-3:00\", Action");
            System.out.println("4 for \"Avengers\", \"8:00-10:00\", Action");
            System.out.println("5 for \"Your Name\", \"10:30-11:45\", Action");
            System.out.println("6 for \"Ek Vivah\", \"8:00-10:00\", Action");
            System.out.println("7 for \"Naruto\", \"10:30-11:45\", Action");
            System.out.println("8 for \"JOKER\", \"8:00-10:00\", Action");
            System.out.println("9 for \"TITANIC\", \"10:30-11:45\", Action");

        } else if (i == 3) {
            System.out.println("Press \"movie name\", \"Time Slot\", Language");
            System.out.println("1 for \"chintaraman\", \"10:30-11:45\", Hindi");
            System.out.println("2 for \"Jujutsu Kaisen\", \"8:00-10:00\", japanese");
            System.out.println("3 for \"Bateman\", \"12:00-3:00\", English");
            System.out.println("4 for \"Avengers\", \"8:00-10:00\", english");
            System.out.println("5 for \"Your Name\", \"10:30-11:45\", japanese");
            System.out.println("6 for \"Ek Vivah\", \"8:00-10:00\", hindi");
            System.out.println("7 for \"Naruto\", \"10:30-11:45\", japanese");
            System.out.println("8 for \"JOKER\", \"8:00-10:00\", english");
            System.out.println("9 for \"TITANIC\", \"10:30-11:45\", english");

        } else if (i == 4) {
            System.out.println("Press | movie name");
            System.out.println("1 for chintaraman");
            System.out.println("2 for Jujutsu Kaisen");
            System.out.println("3 for Bateman");
            System.out.println("4 for Avengers");
            System.out.println("5 for Your Name");
            System.out.println("6 for Ek Vivah");
            System.out.println("7 for Naruto");
            System.out.println("8 for JOKER");
            System.out.println("9 for TITNIC");

        }
    }

    public void BookAMovie() {
//        System.out.println("Select Movie to book (1 for Chintaraman/2 for Ek Vivah)");
        int i = scanner.nextInt();
        scanner.nextLine();
        if (i == 1) {
            Movie Movie1;
            Movie1 = AllMovies.get(0);
            Movie1.BookTickets();
        } else if (i == 2) {
            Movie Movie2;
            Movie2 = AllMovies.get(1);
            Movie2.BookTickets();
        } else if (i == 3) {
            Movie Movie2;
            Movie2 = AllMovies.get(2);
            Movie2.BookTickets();
        } else if (i == 4) {
            Movie Movie2;
            Movie2 = AllMovies.get(3);
            Movie2.BookTickets();
        } else if (i == 5) {
            Movie Movie2;
            Movie2 = AllMovies.get(4);
            Movie2.BookTickets();
        } else if (i == 6) {
            Movie Movie2;
            Movie2 = AllMovies.get(5);
            Movie2.BookTickets();
        } else if (i == 7) {
            Movie Movie2;
            Movie2 = AllMovies.get(6);
            Movie2.BookTickets();
        } else if (i == 8) {
            Movie Movie2;
            Movie2 = AllMovies.get(7);
            Movie2.BookTickets();
        } else if (i == 9) {
            Movie Movie2;
            Movie2 = AllMovies.get(8);
            Movie2.BookTickets();
        }
    }

    @Override
    public String toString() {
        Integer i = cinemaNumber;
        return "Cinema" + i.toString();
    }

}
