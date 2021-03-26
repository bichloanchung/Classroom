import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Student;

public class ClassroomTest {

	@Test
	public void testCN() {
		ArrayList<Student> std = new ArrayList<Student>();
		Classroom cl = new Classroom("Software Tester", "Spring 2021", std);
		assertTrue(cl.getClassroomName().equals("Software Tester"));
		
	}
	@Test
	public void testCT() {
		ArrayList<Student> std = new ArrayList<Student>();
		Classroom cl = new Classroom("Software Tester", "Spring 2021", std);
		assertEquals(cl.getClassroomTerm().equals("Spring 2021"), true);	
	}
	@Test
	public void testANS() {
		ArrayList<Student> std = new ArrayList<Student>();
		Classroom cl = new Classroom("Software Tester", "Spring 2021", std);
		Student st1 = new Student("Thi", "Chung", 20, 'F');
		Student st2 = new Student("Suu", "Tran", 18, 'M');
		cl.addANewStudent(st1);
		cl.addANewStudent(st2);
		assertEquals(st1.getFirstName() == "Thi", true);
	}
	@Test
	public void testLen() {
		ArrayList<Student> std = new ArrayList<Student>();
		Classroom cl = new Classroom("Software Tester", "Spring 2021", std);
		Student st1 = new Student("Thi", "Chung", 20, 'F');
		Student st2 = new Student("Suu", "Tran", 18, 'M');
		cl.addANewStudent(st1);
		cl.addANewStudent(st2);
		assertEquals(std.size() == 2, true);
	}

}
