import static org.junit.Assert.*;

import org.junit.Test;

import MinHeap.Heap;
import MinHeap.Max;


public class TestMinHeap {

	@Test
	public void test() {

		Heap<String> one = new Heap<String>(new Max());
		one.add("1");
		one.add("2");
		one.add("3");
		one.add("4");
		one.add("5");
		one.add("6");
		one.add("7");
		one.add("8");
		one.add("9");
		System.out.println(one.toString());
		assertEquals(" 1 5 6 3 9 2 7 8 4",one.toString());
	}

}
