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


	private Node< E > head;
	private int size;

	/**
	 * linkedlist with head = null
	 */
	public LinkedList()
	{
		head = null;
		size = 0;
	}
	
	private void locationCheck( int loc )
	{
		if( loc < 0 || loc >= size )
		{
			throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * 
	 * @param data first data of the linked list
	 */
	public LinkedList( E data )
	{
		head = new Node< E >( null, data ); 
	}

	public boolean add( E data )
	{
		if ( head != null)
		{
			Node< E > current;
			for ( current = head; head.next != null; current = head.next);
			current.next = new Node< E >( null, data ) ;
		}
		head = new Node< E >(null, data);
		return true;
	}

	public void add( int loc, E o )
	{
		locationCheck( loc );
		Node< E > current = head;
		int location = 0;
		while( current.next != null )
		{
			if( location + 1 == loc )
			{
				current.next = new Node< E > ( current.next.next, o );
			}
			location++;
		} 
		current.next = new Node< E >( null, o ) ;
	}
	

	////////////////////////////////
	//private Boolean add(Object o); 
	//private void add(int loc, Object o); 
	//private Object remove(int loc); 
	//private boolean remove(Object o); 
	//private Object set(int loc, Object o); 
	//private Object get(int loc); 
	//private int size; 
	//private int indexOf(Object o); 
	//private void clear();
	//private boolean contains(Object o);
	//private int lastIndexOf(Object o);
	//private Object[] toArray();
	//private String toString(); 
	//private boolean equals(Object o);
	//boolean isObjectmpty() 

	public Object remove( int loc )
	{
		return new Object();
	}

	public boolean remove( Object o)
	{
		return true;
	}
	public Object set( int loc, Object o )
	{
		return new Object();
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
		//		public Node<E> getNext()
		//		{
		//			return next;
		//		}
		//		
		//		
		//		/**
		//		 * 
		//		 * @return data of the node
		//		 */
		//		public E getData()
		//		{
		//			return data;
		//		}
		//		
		//		public E setNext(Node n)
		//		{
		//			setNext(n);
		//		}


	}
}
