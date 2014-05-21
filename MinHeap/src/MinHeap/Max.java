package MinHeap;


public class Max<T> implements HeapCompare<T> {

	public int sort(NodeFactory<T> one,NodeFactory<T> two){
		
		return ((NodeFactory<T>)one).compareTo(one,two);
//		if(((Node)one).compareTo((Node)two) < 0)
//			return 1;
//		else
//			return 0;
//	}
		
	}
}