class Tickets {
    private double price;
    private String seatNumber;
    
    public Tickets(double price, String seatNumber) {
        this.price = price;
        this.seatNumber = seatNumber;
    }
    public String getTicketInfo() {
        return "Ticket price: " + price + " and seat number: " + seatNumber;
    }
}
