import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {

	@Test
	public void test() {
		Student st1 = new Student("Thi", "Chung", 20, 'F', 10.0, 8.0, 9.0);
		assertTrue(st1.getFirstName().equals("Thi"));
		st1.calculateAverage();
		assertEquals(st1.calculateAverage(), st1.getAverageGrade(),0);
	}

}
