package ie.gmit;

import java.util.ArrayList;

public class StudentList
{

    public void addStudent(){
        //Creating user-defined class objects
        Student s1=new Student("Danny","danny@gmit.ie");
        Student s2=new Student("Jane","jane@gmit.ie");
        Student s3=new Student("Dream","dream@gmit.ie");

        //creating arraylist
        ArrayList<Student> addStudent=new ArrayList<Student>();
        addStudent.add(s1);//adding Student class object
        addStudent.add(s2);
        addStudent.add(s3);

    }

}
