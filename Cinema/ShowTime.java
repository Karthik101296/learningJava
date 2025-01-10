class ShowTime {
    private String showTime;
    private int availableSeats;

    public ShowTime(String showTime, int availableSeats) {
        this.showTime = showTime;
        this.availableSeats = availableSeats;
    }

    public String getShowtimeInfo() {
        return "Movie Showtime: " + showTime + ", has " + availableSeats + " availableSeats.";
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
