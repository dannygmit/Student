package ie.gmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class StudentTest {

    private Student myStudent;

    @BeforeEach
    void init() {
    }

    @Test
    void testConstructor() {
        Student s = new Student("Danny", "danny@gmit.ie");
        assertEquals("Danny", s.getStudentName());
        assertEquals("danny@gmit.ie", s.getStudentEmail());
    }
    @Test
    void testFailure(){
        assertThrows(IllegalArgumentException.class,()-> {
            new Student("danny",null);});

    }


}
