package MinHeap;

import java.util.Iterator;
import java.util.Stack;

public class HeapIterator<T> implements Iterator<T> {
	
	private Stack<T> stack = new Stack<T>();
	
	public HeapIterator(T iterator){
		stack.push(iterator);
		NodeFactory<T> node = (NodeFactory<T>) stack.peek();
		while(node.hasNext()){
			node = node.getLeft();
			if( !node.isNull())
					stack.push((T) node);
		}
	}
	@Override
	public boolean hasNext() {

		if(stack.empty())
			return false;
		else
			return true;
	}
	

	public T next() {
		if(hasNext()){
			NodeFactory<T> node =(NodeFactory<T>) stack.pop();
			NodeFactory<T> element = node;
			if(!node.getRight().isNull()){
				node = node.getRight();
				stack.push((T) node);
				while(!node.getLeft().isNull()){
					node = node.getLeft();
					stack.push((T) node);
				}									
			}
			return (T) element.getValue();
		}else
			return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
