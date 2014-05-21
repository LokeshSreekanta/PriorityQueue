package two;

import static org.junit.Assert.*;

import java.util.Iterator;


import org.junit.Test;

import MinHeap.Heap;
import MinHeap.IngHeapDecorator;
import MinHeap.Max;
import MinHeap.Min;

public class TestMinHeapToArray {

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
		
		Object[] temp = new Object[9];
		temp[0]="1";
		temp[1]="5";
		temp[2]="6";
		temp[3]="3";
		temp[4]="9";
		temp[5]="2";
		temp[6]="7";
		temp[7]="8";
		temp[8]="4";
		Object[] two = one.toArray();
		for(int i=0; i < 9; i++)
			assertEquals(two[i],temp[i]);
		
		Heap<String> three = new Heap<String>(new Max());
		three.add("1");
		three.add("2");
		three.add("3");
		three.add("4");
		three.add("5");
		three.add("6");
		three.add("7");
		three.add("8");
		three.add("9");
		assertEquals(" 1 5 6 3 9 2 7 8 4",one.toString());
		
		Heap<String> four = new Heap<String>(new Min());
		four.add("1");
		four.add("2");
		four.add("3");
		four.add("4");
		four.add("5");
		four.add("6");
		four.add("7");
		four.add("8");
		four.add("9");
		assertEquals(" 1 5 6 3 9 2 7 8 4",one.toString());
		
		Heap<String> five = new Heap<String>(new Min());
		five.add("a");
		five.add("b");
		five.add("c");
		five.add("d");
		five.add("e");
		five.add("f");
		five.add("g");
		five.add("h");
		five.add("i");
		assertEquals(" a e f c i b g h d",five.toString());
		
		Iterator iterator= one.iterator();
		int i=0;
		while(iterator.hasNext()){
			Object node = (Object) iterator.next();
			assertEquals(node,temp[i]);
			i++;
		}
		
		temp[0]="a";
		temp[1]="e";
		temp[2]="f";
		temp[3]="c";
		temp[4]="i";
		temp[5]="b";
		temp[6]="g";
		temp[7]="h";
		temp[8]="d";
		
		iterator = five.iterator();
		i=0;
		while(iterator.hasNext()){
			Object node = (Object) iterator.next();
			assertEquals(node,temp[i]);
			i++;
		}
		
		
		temp[1]="cating";
		temp[2]="eating";
		temp[3]="hatching";

		
		IngHeapDecorator<String> six = new IngHeapDecorator<String>(new Min());
		six.add("apple");
		six.add("eating");
		six.add("fly");
		six.add("cating");
		six.add("ink");
		six.add("blank");
		six.add("bank");
		six.add("hatching");
		six.add("dog");
		
		assertEquals("[cating, eating, hatching]",six.toString());
		
		
		iterator = six.iterator();
		i=1;
		while(iterator.hasNext()){
			Object node = (Object) iterator.next();
			assertEquals(node,temp[i]);
			i++;
		}
	}

}
