package MinHeap;

import java.util.Iterator;
import java.util.Stack;

public class IngFilter<T> implements Iterator<T> {
		
		private Stack stack = new Stack();
		
		public IngFilter(Iterator<T> iterator){
			stack.push(iterator);
			NodeFactory<T> node = (NodeFactory<T>) stack.peek();
			while(node.hasNext()){
				node = node.getLeft();
				if( !node.isNull())
						stack.push(node);
			}
		}
		@Override
		public boolean hasNext() {
			NodeFactory<T> node;
			String substr = null;
			while(!stack.empty()){
				node = (NodeFactory<T>) stack.peek();
				substr = ((String) node.getValue()).substring(((String) node.getValue()).length()-3);
				if((((String) node.getValue()).length() >= 3) && ("ing".compareTo(substr)==0))
						return true;
				
				else{
						node =(NodeFactory<T>) stack.pop();
						NodeFactory<T> element = node;
						if(!node.getRight().isNull()){
							node = node.getRight();
							stack.push(node);
							while(!node.getLeft().isNull()){
								node = node.getLeft();
								stack.push(node);
							}				
						}
					}
			}
				return false;
		}
		

		public T next() {
			if(hasNext()){
				NodeFactory<T> node =(NodeFactory<T>) stack.pop();				
				return (T) node.getValue();
				
			}else
				return null;
		}
		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
}


