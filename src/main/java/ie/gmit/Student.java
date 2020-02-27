package ie.gmit;

public class Student {

    private String studentName;
    private String studentEmail;

    public Student( String studentName, String studentEmail) {
        if (studentName == null || studentEmail == null){
            throw new IllegalArgumentException("Error");
        }
        else {
            this.studentName = studentName;
            this.studentEmail = studentEmail;
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }


}
