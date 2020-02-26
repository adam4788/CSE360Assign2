/*
 * @author adam nugroho 
 * Class Id: 109 
 * Assignment#:1 
 * Description: JUnit Test Class
 */
package assign1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class SimpleListTest {

	@Test
	void testSimpleList() {
		SimpleList testList = new SimpleList();
		assertEquals(testList.count(), 0);
	}

	@Test
	void testAdd() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		assertEquals(1, testList.count()); 		//two test cases each method 1 assert per method	//comment this one too
	}

	@Test
	void testRemove() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		testList.remove(1);
		testList.remove(2);
		assertEquals(0, testList.count());
	}

	@Test
	void testCount() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		assertEquals(1, testList.count());
	}

	@Test
	void testToString() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		assertNotNull(testList.toString());
	}

	@Test
	void testSearch() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		assertEquals(1, testList.count());
	}
}
