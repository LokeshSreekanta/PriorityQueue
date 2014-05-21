package MinHeap;

import java.util.Iterator;


public class Heap<T> extends Tree<T>{
	
	
	public Heap(HeapCompare<T> minOrMax){
		NodeFactory<T> nullObject = new Null<T>();
		root = nullObject;
		algorithm = minOrMax;
		size = 0;
	}
	
	public void preOrder(){
		root.preOrder(root);
	}
	
	public Iterator<T> iterator(){
		return new HeapIterator(root);
	}
	
	public boolean add(T value){
		super.add(value);
		return true;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public String toString(){
		String string = new String();
		Iterator iterator = new HeapIterator(root);
		while(iterator.hasNext()){
			string = string +" "+iterator.next();
		}
		return string;		
	}
	
	@Override
	public Object[] toArray() {
		Object[] arr = new Object[size];
		return toArray(arr);
	}
	
	@Override
	public Object[] toArray(Object[] a){
		Object[] arr = new Object[size];
		int index =0;
		Iterator<T> iterator = iterator();
		while(iterator.hasNext()){
			Object node = (Object) iterator.next();
			arr[index] = node;
			index ++;	
		}
		return arr;
	}
}
