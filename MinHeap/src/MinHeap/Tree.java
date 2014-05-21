package MinHeap;

import java.util.AbstractCollection;
import java.util.Iterator;

public abstract class Tree<T> extends AbstractCollection<T>{
	protected HeapCompare<T> algorithm;
	protected NodeFactory<T> root;
	protected int size = 0;
	protected T toString = null;
	
	public int getSize(){
		return size;
	}
	public void swap(NodeFactory<T> nodeOne, NodeFactory<T> nodeTwo){
		int nodeOneStringValue = 0;
		nodeOneStringValue = (int) algorithm.sort(nodeOne,nodeTwo);
		if(nodeOneStringValue > 0)
			nodeOne.swap(nodeOne,nodeTwo);
		
	}
	
	public boolean add(T data){
		NodeFactory<T>  node, current, previous = null;
		int leftHeight,rightHeight=0;
		Boolean isRight = false;
		node = new Node<T>(data);
		size = size + 1;
		if(root.isNull()){
			root = node;
			return true;
		}
		current = root;
		while(!current.isNull()){
			isRight = false;
			previous  = current;
			leftHeight = current.height(current.getLeft());		
			rightHeight = current.height(current.getRight());		
			
			if(rightHeight < leftHeight){
				swap(node,current);
				isRight = true;
				current = current.getRight();
			}
			else{
				swap(node,current);
				current = current.getLeft();
			}
		}
		if(isRight)
			previous.setRight(node);
		else
			previous.setLeft(node);
		return true;
	}
	
	
	public abstract void preOrder();
	public abstract Iterator<T> iterator();

}
