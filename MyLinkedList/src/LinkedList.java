/**
 * 
 * @author Taha Amir
 * @version 1.0
 * @param e type
 */
public class LinkedList< E >
{
////////////////////////////////
// private Boolean add(Object o); 
// private void add(int loc, Object o); 
// private Object remove(int loc); 
// private boolean remove(Object o); 
// private Object set(int loc, Object o); 
// private Object get(int loc); 
// private int size; 
// private int indexOf(Object o); 
// private void clear();
// private boolean contains(Object o);
// private int lastIndexOf(Object o);
// private Object[] toArray();
// private String toString(); 
// private boolean equals(Object o);
// boolean isObjectmpty() 

	
	Node< E > head;
	
	/**
	 * head = null
	 */
	public LinkedList()
	{
		head = null;
	}
	
	/**
	 * 
	 * @param data first data of the linked list
	 */
	public LinkedList(E data)
	{
		head = new Node<E>(null, data);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 * @author amirta18
	 * @version 1.0
	 * @param <E> type
	 */
	private class Node< E >
	{
		private Node< E > next;
		private E data;
		
		/**
		 * creates a default
		 */
		public Node()
		{
			super();
			new Node< E >( null, null );
		}
		
		/**
		 * 
		 * @param n next node
		 * @param d data of type e
		 */
		public Node( Node n, E d )
		{
			super();
			next = n;
			data = d;
		}
		
		/**
		 * 
		 * @return returns the next node in the list
		 */
		public Node<E> getNext()
		{
			return next;
		}
		
		/**
		 * 
		 * @return data of the node
		 */
		public E getData()
		{
			return data;
		}
		
		
	}
}
