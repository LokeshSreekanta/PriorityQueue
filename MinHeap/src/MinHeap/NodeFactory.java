package MinHeap;

import java.util.Iterator;

public abstract class NodeFactory<T> implements Iterator<T>{

	protected abstract int compareTo(NodeFactory<T> one, NodeFactory<T> two);
	protected T value = null; 
	protected NodeFactory<T> right;
	protected NodeFactory<T> left;
	public abstract boolean isNull();
	public abstract T getValue() ;
	public abstract void setValue(T object);
	public abstract void preOrder(NodeFactory<T> root);
	public abstract NodeFactory<T> getLeft();
	public abstract NodeFactory<T> getRight();
	public abstract int height(NodeFactory<T> node);
	public abstract void swap(NodeFactory<T> nodeOne, NodeFactory<T> nodeTwo);
	public abstract void setRight(NodeFactory<T> node);
	public abstract void setLeft(NodeFactory<T> node);

}
