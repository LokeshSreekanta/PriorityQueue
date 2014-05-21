package MinHeap;

import java.util.Collection;
import java.util.Iterator;

public class IngHeapDecorator<T> extends Tree<T> {

	public IngHeapDecorator(HeapCompare<T> minOrMax){
		NodeFactory<T> nullObject = new Null<T>();
		root = nullObject;
		algorithm = minOrMax;
		size = 0;
	}
	public boolean add(T value){
		return super.add(value);
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new IngFilter(root);
	}
	public void preOrder(){
		root.preOrder(root);
	}
	@Override
	public int size() {
		Iterator<String> iterator = iterator();
		int count =0;
		Object node;
		while(iterator.hasNext()){
			node = (Object) iterator.next();
			count++;
		}
		return count;
	}
	@Override
	public Object[] toArray() {
		Object[] arr = new Object[size()];
		int index =0;
		Iterator iterator = iterator();
		while(iterator.hasNext()){
			Object node = (Object) iterator.next();
			arr[index] = node;
			index ++;	
		}
		return arr;
	}
	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}
}
