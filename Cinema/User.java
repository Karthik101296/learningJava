class User {
    private String userName;
    private String userEmail;
    private int noOfTickets;

    public User(String userName, String userEmail, int noOfTickets) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.noOfTickets = noOfTickets;
    }

    public void bookTicket() {
        if(noOfTickets == 1) {
            System.out.println(userName + " has booked " + noOfTickets + " movie ticket successfully.");
        } else if(noOfTickets > 1) {
            System.out.println(userName + " has booked " + noOfTickets + " movie tickets successfully.");
        } else {
            System.out.println("Please add number of tickets to buy a ticket");
        }
    }

    public void cancelTicket() {
        System.out.println("Ticket cancelled by " + userName + ".");
    }

    public void getUserDetails() {
        System.out.println("User Name: " + userName + ", Email: " + userEmail);
    }
}
