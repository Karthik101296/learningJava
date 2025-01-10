class Movie {
    private String title;
    private String description;
    private int duration;

    public Movie(String title, String description, int duration) {
        this.title = title;
        this.description = description;
        this.duration = duration;
    }

    public String getMovieDetails() {
        return "Movie: " + title + ", Description: " + description + " and Duration: " + duration + " minutes";
    }
}