import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {

	@Test
	public void test() {
		Person p = new Person("Rafael", "Silva", 30,'M');
		assertEquals(p.getFirstName().equals("Rafael"),true);
		assertEquals(p.getLastName().equals("Silva"),true);
		assertTrue(p.getAge()==30);
		assertTrue(p.getGender()=='M');
	}
	@Test
	public void test2() {
		Person p = new Person(" ", " ",0,' ');
		p.setFirstName("Firstname");
		p.setLastName("Lastname");
		p.setAge(18);
		p.setGender('F');
		assertEquals(p.getFirstName().equals("Rafael"),false);
		assertEquals(p.getLastName().equals("Silva"),false);
		assertFalse(p.getAge()==30);
		assertTrue(p.getGender()!='M');
		
	}
	

}
