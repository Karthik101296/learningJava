
public class LibrarySystem {

    public static void main(String[] args) {
        StudentMember student = new StudentMember("S001", "Alice", "Grade 10");
        student.borrowBook(); // Inherited from LibraryMember
        student.memberId(); // Inherited from LibraryMember
        student.attendClass(); // Defined in StudentMember

        FacultyMember faculty = new FacultyMember("F001", "Dr. Smith", "Computer Science");
        faculty.borrowBook(); // Calls overridden borrowBook method in FacultyMember

        System.out.println("================");
        
        LibraryMember1 member = new LibraryMember1("L001", "Jhon");
        member.borrowItem("Introduction to Java Programming");
        member.returnItem("Introduction to Java Programming");

        LibraryMember1 member1 = new LibraryMember1("L002", "Ram");
        member1.borrowItem("Introduction to Java Programming");
    }
}
