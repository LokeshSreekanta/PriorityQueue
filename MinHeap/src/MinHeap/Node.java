package MinHeap;
import java.util.Iterator;


public class Node<T> extends NodeFactory<T> implements Iterator<T> {
		
	public Node(T input){
		Null<T> nullObject = new Null<T>();
		value = input;
		right = nullObject;
		left = nullObject;		
	}
	
	public int compareTo(NodeFactory<T> one,NodeFactory<T> two){
		int nodeOneStringValue = 0;
		String stringOne = (String) one.getValue();
		String stringTwo = (String) two.getValue();
		nodeOneStringValue = stringOne.compareTo(stringTwo);
		if(nodeOneStringValue > 0)
			return 1;
		else
			return 0;
	}
	public void setValue(T inputString){
		value = inputString;
	}
	
	public T getValue(){
		return value;
	}
	
	public void setLeft(NodeFactory<T> node){
		left =  node;
	}
	public void setRight(NodeFactory<T> node){
		right =  node;
	}
	public NodeFactory<T> getLeft(){
		return left;
	}
	public NodeFactory<T> getRight(){
		return right;
	}
	public void preOrder(NodeFactory<T> node){
		if(node.isNull())
				return;
		System.out.print(node.getValue()+",");
		preOrder(node.getLeft());
		preOrder(node.getRight());
	}
		
	public int height(NodeFactory<T> node){
			return (1+Math.max(node.height(node.getLeft()), node.height(node.getRight())));
	}

	public void swap(NodeFactory<T> nodeOne, NodeFactory<T> nodeTwo){
			T temp;
			temp = nodeTwo.getValue();
			nodeTwo.setValue(nodeOne.getValue());
			nodeOne.setValue(temp);
	}

	public T print(){
		return getValue();
	}
	
	public Iterator<T> createIterator(){
		return null;
	}

	@Override
	public boolean hasNext() {
		NodeFactory<T> leftChild,rightChild;
		leftChild = getLeft();
		rightChild = getRight();
		if((leftChild.isNull()) && (rightChild.isNull()))
			return false;
		else
			return true;
	}
	@Override
	public T next() {
		// TODO Auto-generated method stub
		//return getLeft().value;
		return null;
	}
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
