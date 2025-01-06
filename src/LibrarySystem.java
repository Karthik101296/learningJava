
public class LibrarySystem {

    public static void main(String[] args) {
        StudentMember student = new StudentMember("S001", "Alice", "Grade 10");
        student.borrowBook(); // Inherited from LibraryMember
        student.memberId(); // Inherited from LibraryMember
        student.attendClass(); // Defined in StudentMember

        FacultyMember faculty = new FacultyMember("F001", "Dr. Smith", "Computer Science");
        faculty.borrowBook(); // Calls overridden borrowBook method in FacultyMember
    }
}
