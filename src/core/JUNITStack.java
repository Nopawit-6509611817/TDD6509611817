package core;

import junit.framework.TestCase;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class JUNITStack {

	@Test
	public void testCreateNewEmptyStack() {
		
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
	}
	@Test
	public void testPushElmToTop() {
		Stack s1 = new Stack();
		assertFalse(s1.isFull());
		int obj1 = new Integer(1);
		s1.push(obj1);
		assertEquals(s1.top(), obj1);
	}
	
	@Test
	public void testLastInFirstOut() {
		Stack s1 = new Stack();
		Integer obj1 = new Integer(1);
		Integer obj2 = new Integer(2);
		try {
			
			s1.push(obj1);
			s1.push(obj2);
		
			 } catch (Exception e) {
			e.printStackTrace();
			 }

	
			 assertEquals(s1.pop(), obj2);
			 assertEquals(s1.pop(), obj1);
			 
	}
	
	@Test
	public void pushElmToLimitedSizeStack() {
		Stack s1 = new Stack();
		Integer obj1 = new Integer(1);
		Integer obj2 = new Integer(2);
		Integer obj3 = new Integer(3);
		s1.push(obj1);
		s1.push(obj2);
		s1.push(obj3);
		
		assertTrue(s1.isFull());
		
		Integer obj4 = new Integer(4);
		assertNotEquals(obj3, obj4);
		s1.push(obj4);
		assertEquals(s1.pop(), obj3);
			
			
		
			 
	}
	
}
