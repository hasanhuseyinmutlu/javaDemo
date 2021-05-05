public class Main {

    public static void main(String[] args) {
        User user = new User();
        User user2 = new User();

        user.Id = 1;
        user.fistName = "Hasan Huseyin";
        user.lastName = "Mutlu";
        user.email = "writexacah@hotmail.com";

        user2.Id = 2;
        user2.fistName = "Engin";
        user2.lastName = "Demirog";
        user2.email = "engindemirog@gmail.com";

        Student student = new Student();
        student.studentId = user.Id;
        student.ınstructor = "Engin Demiroğ";
        student.course = "Java + React yazılım geliştirme kursu";
        student.fistName = user.fistName;
        student.lastName = user.lastName;
        student.email = user.email;

        Instructor instructor = new Instructor();
        instructor.InstructorId = user2.Id;
        instructor.profession = "Software";
        instructor.fistName = user2.fistName;
        instructor.lastName = user2.lastName;
        instructor.email = user2.email;


        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();
        UserManager userManager = new UserManager();

        studentManager.add();
        instructorManager.add();
        userManager.logIn(user);
        userManager.delete(user2);
        instructorManager.delete();
        userManager.logOut(user);
    }
}
