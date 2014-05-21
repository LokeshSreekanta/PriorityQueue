package MinHeap;

import java.util.Iterator;

public class TestHeap {
	public static void main(String args[]){
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
		one.preOrder();
		System.out.println("now thread-------");
		System.out.println("-------------");
		Iterator<String> iterator = one.iterator();
		System.out.println("finally created Iterator");
		while(iterator.hasNext()){
			Object node = (Object) iterator.next();
			System.out.println("node is here "+node);
		}
		IngHeapDecorator<String> two = new IngHeapDecorator<String>(new Min());
		two.add("a");
		two.add("b");
		two.add("cing");
		two.add("d");
		two.add("eing");
		two.add("sharathing");
		two.add("bharathing");
		two.preOrder();
		//iterator = new IngFilter(iterator);
		iterator = two.iterator();
		//two = new IngFilter(two);
		while(iterator.hasNext()){
			Object node = (Object) iterator.next();
			System.out.println("node is here "+node);
		}
		//String[] arr = new String[10];
		Object[] arr = (Object[]) two.toArray();
		for( int i =0 ; i <arr.length;i++)
			System.out.println("array is "+arr[i]);
		
		System.out.println("size is "+one.getSize());
		Object[] arrOne = (Object[]) one.toArray();
		for( int i =0 ; i <arrOne.length;i++)
			System.out.println("array is "+arrOne[i]);
		
		System.out.println("to string is "+one.toString());
		System.out.println("a".compareTo("a"));
		
	}
}
