package MinHeap;

public class Null<T> extends NodeFactory<T> {

	public boolean isNull(){
		return true;
	}

	public int height(NodeFactory<T> node) {
		return 0;
	}

	@Override
	public T getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValue(T value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preOrder(NodeFactory<T> root) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NodeFactory<T> getLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NodeFactory<T> getRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void swap(NodeFactory<T> nodeOne, NodeFactory<T> nodeTwo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRight(NodeFactory<T> node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLeft(NodeFactory<T> node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected int compareTo(NodeFactory<T> one, NodeFactory<T> two) {
		return 0;
	}
}
