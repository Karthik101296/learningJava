
public class LibraryMember1 implements Borrowable, Returnable {
    private String memberId;
    private String name;

    public LibraryMember1(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    @Override
    public void borrowItem(String item) {
        System.out.println(name + " whose memberID is " + memberId + " borrowed " + item);
    }

    @Override
    public void returnItem(String item) {
        System.out.println(name + " whose memberID is " + memberId + " returned " + item);
    }
}
