
package cinematicketreservationsystem;

public class TicketBill {

    private int ticketprice;

    public TicketBill() {
        this.ticketprice = 100;
    }

    public void ComputeBill(int tickets) {
        int total = ticketprice * tickets;
        System.out.println("Your bill is " + total);
    }

}
