
public class CinemaBookingSystem {
    public static void main(String[] args) {
        Movie movie = new Movie("Hello JAVA", "Java is a high-level, class-based and object-oriented programming language", 148);
        ShowTime showtime = new ShowTime("6:00 pm", 7);
        Tickets ticket = new Tickets(300.0, "K10");
        User user = new User("Jhon Cena", "jhonceana@test.com", 2);

        System.out.println(movie.getMovieDetails()); // output - Movie: Hello JAVA, Description: Java is a high-level, class-based and object-oriented programming language and Duration: 148 minutes
        System.out.println(showtime.getShowtimeInfo()); // output - Movie Showtime: 6:00 pm, has 7 availableSeats.
        System.out.println(ticket.getTicketInfo()); // output - Ticket price: 300.0 and seat number: K10
        user.bookTicket(); // output - Jhon Cena has booked 2 movie tickets successfully.
    }
}
