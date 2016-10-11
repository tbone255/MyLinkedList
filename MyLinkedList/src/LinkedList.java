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
			for ( current = head; current.next != null; current = current.next);
			current.next = new Node< E >( null, data ) ;
			size++;
			return true;
		}
		head = new Node< E >(null, data);
		size++;
		return true;
	}

	public void add( int loc, E o )
	{
		

		if(head == null)
		{
			 add( o );
			 return; 
		}
			 
		locationCheck( loc );
		
		int location = -1;
		Node< E > current = head;
		
		while( current.next != null)
		{
			if( location + 1 == loc)
			{
				current.next = new Node< E >( current.next.next, o );
				size++;
				return;
			}
			location++;
			current = current.next;
		}
	}
	

	
	/**
	 * 
	 * @param loc the location of element
	 * @return returns the removed element
	 */
	public E remove( int loc )
	{
		locationCheck( loc );
		
		Node< E > current = new Node< E >(head, null) ;
		
		int location = -1;
		while( current.next != null )
		{
			if( location + 1 >= loc )
			{
				current.next = current.next.next;
			}
			else
			{
				current = current.next;
			}
			location++;
		}
		size--;
		return ( E ) new Object();
	}

	/**
	 * 
	 * @param o the object to remove
	 * @return true if removed
	 */
	public boolean remove( Object o)
	{
		
		return true;
	}
	
	/**
	 * 
	 * @param loc location to be changed
	 * @param o the object that is intended
	 * @return the old object
	 */
	public E set( int loc, Object o )
	{
		locationCheck( loc);
		return ( E ) new Object();
	}
	
	/**
	 * 
	 * @param loc the location that shall be grabbed
	 * @return the object at loc
	 */
	public E get( int loc )
	{
		locationCheck(loc);
		Node< E > current = head;
		int location = 0;
		while( current.next != null )
		{
			if( location == loc )
			{
				break;
			}
			current = current.next;
			location++;
			
		}
		return (E) current.data;
	}
	
	/**
	 * 
	 * @return size of linkedlist
	 */
	public int size()
	{
		return size;
	}
	
	public int indexOf(Object o)
	{
		Node< E > current = head;
		int location = 0;
		
		while( current != null)
		{
			if(current.data.equals( o ) )
			{
				return location;
			}
			location++;
			current = current.next;
		}
		return -1;
	}

	public void clear()
	{
		head = null;
		size = 0;
	}
	
	
	public boolean contains(Object o)
	{
		return false;
	}
	
	public int lastIndexOf(Object o)
	{
		return 1;
	}
	
	public Object[] toArray()
	{
		int location = 0;
		if (  head == null )
		{
			return new Object[0];
		}
		Object[] temp = new Object[size];
		Node current;
		for ( current = head; current.next != null; current = current.next)
		{
			temp[location] = current.data;
			location++;
		}
		return temp;
	}
	
	public String toString()
	{
		if( size == 0 )
		{
			return "[]";
		}
		
		Node< E > current = head.next;
		String s = "[" + head.data;
		while( current != null )
		{
			s += ", " + current.data;
			current = current.next;
		}
		return s + "]";
	}
	
	public boolean equals(Object o)
	{
		return true;
	}
	
	public boolean isEmpty() 
	{
		return size == 0;
	}
	/**
	 * 
	 * @author amirta18
	 * @version 1.0
	 * @param <E> type
	 */
	private class Node< E >
	{
		private Node next;
		private E data;

		/**
		 * creates a default
		 */
		public Node()
		{
			this( null, null );
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