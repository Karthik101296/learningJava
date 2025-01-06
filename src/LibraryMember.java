
// Superclass
public class LibraryMember {

    private String memberId;
    private String name;

    public LibraryMember(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public void borrowBook() {
        System.out.println(name + " is borrowing a book.");
    }

    public void memberId() {
        System.out.println(name + "'s member ID is - " + memberId);
    }

    // Getters and Setters
    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }
}
