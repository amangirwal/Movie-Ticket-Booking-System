
package cinematicketreservationsystem;


public class Tickets {

    private int ticketnum;
    private Seats seatnum;

    public Tickets(int tnum, int snum) {

        ticketnum = tnum;
        seatnum = new Seats(snum);
    }

    public void SetTickets(int tnum) {
        this.ticketnum = tnum;

    }

    public int GetTickets() {
        return this.ticketnum;
    }

    public boolean deductTickets(int t) {
      
        
        if (t > 5 || t>ticketnum) {
            
            return false;
        } else {
            ticketnum -= t;
            System.out.println("After booking, tickets available:" + ticketnum);
            return true;
        }
    }
}
