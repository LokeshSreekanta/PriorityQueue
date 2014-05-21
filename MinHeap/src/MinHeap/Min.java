package MinHeap;


public class Min<T> implements HeapCompare<T> {

	public int sort(NodeFactory<T> one,NodeFactory<T> two){
		
		return ((NodeFactory<T>)one).compareTo(one,two);
	}
		
}
