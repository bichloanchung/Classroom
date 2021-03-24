import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Student;

public class ClassroomTest {

	@Test
	public void test() {
		ArrayList<Student> std = new ArrayList<Student>();
		Classroom cl = new Classroom("Software Tester", "Spring 2021", std);
		Student st1 = new Student("Thi", "Chung", 20, 'F');
		Student st2 = new Student("Suu", "Tran", 18, 'M');
		cl.addANewStudent(st1);
		cl.addANewStudent(st2);
		assertTrue(cl.getClassroomName().equals("Software Tester"));
		assertEquals(cl.getClassroomTerm().equals("Spring 2021"), true);
		
	}

}
