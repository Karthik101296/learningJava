
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

        System.out.println("===Polymorphism===");

        LibraryMember member2 = new LibraryMember("L001", "Alice");
        member2.borrowItem("Java Programming");
        member2.borrowItem("Python Programming", 14);
        member2.borrowItem("C++ Programing", 7, "Mr. Smith");
    }
}
