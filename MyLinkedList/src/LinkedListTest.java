//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//public class LinkedListTest {
//
//    @Test
//    public void test(    ) {
//        fail(  "Not yet implemented"  );
//    }
//
//}
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Moo
 * 
 * @author Meermans
 * @version 9/16/2014
 * 
 */
public class LinkedListTest {
    private LinkedList<String> words;

    /** Test something */
    @Before
    public void setUp(  ) {
        words = new LinkedList<String>(  );
    }

    /** Moo */
    @After
    public void tearDown(  ) {
        words = null;
    }

    /** Moo */
    @Test
    public void testConstructor(  ) {
        words = new LinkedList<>(  );
        assertEquals( 0, words.size(  ) );

    }

    /** Moo */
    @Test
    public void testAdd(  ) {
        assertTrue( words.add( "hello" ) );
        assertEquals( 1, words.size(  ) );
        assertTrue( words.add( "world" ) );
        assertEquals( 2, words.size(  ) );
        assertTrue( words.add( "blue" ) );
        assertEquals( 3, words.size(  ) );
        assertTrue( words.add( "hello" ) );
        assertTrue( words.add( "hello" ) );
        assertTrue( words.add( "hello" ) );
        assertTrue( words.add( "hello" ) );
        assertTrue( words.add( "hello" ) );
        assertTrue( words.add( "hello" ) );
        assertTrue( words.add( "hello" ) );
        assertTrue( words.add( "hello" ) );

        assertSame( "hello", words.get( 0 ) );
        assertSame( "blue", words.get( 2 ) );
    }

    /** Moo */
    @Test
    public void testAddLoc(  ) {
        words.add( 0, "5" );
        words.add( 0, "3" );
        words.add( 1, "4" );
        assertSame( "3", words.get( 0 ) );
        assertSame( "4", words.get( 1 ) );
        assertSame( "5", words.get( 2 ) );
        assertEquals( 3, words.size(  ) );
        words.add( words.size(), "10");
        assertEquals( "10", words.get( words.size() - 1 ) );
        words.add( 2, "10");
        assertEquals( "10", words.get( 2 ) );
    }

    /** Moo */
    @Test( expected = IndexOutOfBoundsException.class )
    public void testAddIndexOutOfBoundsException(  ) {
        words.set( -1, "5" );
        words.add( 9999, "5" );
        words.add( 1, "5" );
        assertSame( "5", words.get( 1 ) );

    }

    /** Moo */
    @Test
    public void testLargeAdd(  ) {
        for ( int i = 0; i < 10000; i++ ) {
            words.add( "" + i );
        }
        assertEquals( 10000, words.size(  ) );
        assertEquals( "0", words.get( 0 ) );
        assertEquals( "9999", words.get( 9999 ) );
    }

    /** Moo */
    @Test
    public void testClear(  ) {
        words.add( "5" );
        words.clear(  );
        assertEquals( 0, words.size(  ) );
    }

    /** Moo */
    @Test
    public void testContainsTrue(  ) {
        words.add( "100" );
        assertTrue( words.contains( "100" ) );
        words.add( "500" );
        assertTrue( words.contains( "500" ) );
    }

    /** Moo */
    @Test
    public void testContainsFalse(  ) {
        assertFalse( words.contains( "0" ) );
        words.add( "100" );
        assertFalse( words.contains( "0" ) );
        words.add( "200" );
        assertFalse( words.contains( "500" ) );
    }

    /** Moo */
    @Test
    public void testGet(  ) {
        words.add( "moo" );
        words.add( "cow" );
        assertSame( "moo", words.get( 0 ) );
        assertSame( "cow", words.get( 1 ) );
    }

    /** Moo */
    @Test( expected = IndexOutOfBoundsException.class )
    public void testGetFail(  ) {
        words.get( 0 );
        words.get( -1 );
        words.add( "5" );
        words.get( 999999 );
        assertSame( "5", words.get( 0 ) );
    }

    /** Moo */
    @Test( expected = IndexOutOfBoundsException.class )
    public void testGetFail2(  ) {
        words.get( 0 );
        words.add( "5" );
        assertSame( "5", words.get( 0 ) );
    }

    /** Moo */
    @Test( expected = IndexOutOfBoundsException.class )
    public void testGetFail3(  ) {
        words.add( "0" );
        words.add( "0" );
        words.add( "0" );
        words.get( 3 );
        assertSame( "0", words.get( 2 ) );
    }

    /** Moo */
    @Test
    public void testIndexOf(  ) {
        words.add( "monkey" );
        assertEquals( 0, words.indexOf( "monkey" ) );
        words.add( "donkey" );
        assertEquals( -1, words.indexOf( "honkey" ) );
    }

    /** Moo */
    @Test
    public void testIsEmpty(  ) {
        assertTrue( words.isEmpty(  ) );
        words.add( "hello" );
        assertFalse( words.isEmpty(  ) );
        words.remove( 0 );
        assertTrue( words.isEmpty(  ) );
    }

    /** Moo */
    @Test
    public void testLastIndexOf(  ) {
        assertEquals( -1, words.lastIndexOf( "0" ) );
        words.add( "5" );
        assertEquals( 0, words.lastIndexOf( "5" ) );
        words.add( "5" );
        assertEquals( 1, words.lastIndexOf( "5" ) );
        words.add( "3" );
        words.add( "5" );
        assertEquals( 3, words.lastIndexOf( "5" ) );
        assertEquals( -1, words.lastIndexOf( "Hello" ) );
    }

    /** Moo */
    @Test
    public void testRemove(  ) {
        words.add( "5" );
        words.add( "6" );
        words.add( "7" );
        words.add( "5" );
        words.add( "6" );
        words.add( "7" );
        assertEquals( "5", words.remove( 0 ) );
        assertEquals( 5, words.size(  ) );
        assertEquals( "7", words.remove( 1 ) );
        assertEquals( 4, words.size(  ) );
        words.add( "5" );
        words.add( "6" );
        words.add( "7" );
        assertEquals( "6", words.remove( 2 ) );
        
    }

    /** Moo */
    @Test( expected = IndexOutOfBoundsException.class )
    public void testRemoveIndexOutOfBoundsException(  ) {
        words.remove( -1 );
        words.add( "5" );
        assertSame( "5", words.get( 0 ) );
    }

    /** Moo */
    @Test( expected = IndexOutOfBoundsException.class )
    public void testRemoveIndexOutOfBoundsException2(  ) {
        words.add( "0" );
        words.remove( 1 );
        words.add( "5" );
        assertSame( "5", words.get( 0 ) );
    }

    /** Moo */
    @Test
    public void testRemoveObject(  ) {
        words.add( "5" );
        words.add( "6" );
        words.add( "7" );
        assertTrue( words.remove( "6" ) );
        assertFalse( words.remove( "8" ) );
        assertEquals( 2, words.size(  ) );
    }

    /** Moo */
    @Test( expected = IndexOutOfBoundsException.class )
    public void testSetIndexOutOfBoundsException(  ) {
        words.set( 0, "5" );
        words.add( "5" );
        assertSame( "5", words.get( 0 ) );
    }

    /** Moo */
    @Test( expected = IndexOutOfBoundsException.class )
    public void testSetIndexOutOfBoundsException2(  ) {
        words.add( "6" );
        words.add( "7" );
        words.set( 2, "5" );
        assertSame( "6", words.get( 0 ) );
    }

    /** Moo */
    @Test
    public void testSet(  ) {

        words.add( "6" );
        words.add( "7" );
        assertEquals( "6", words.set( 0, "3" ) );
        assertEquals( "3", words.get( 0 ) );
        assertEquals( "7", words.get( 1 ) );
        assertEquals( 2, words.size(  ) );
    }

    /** Moo */
    @Test
    public void testToArray(  ) {
        words.add( "5" );
        words.add( "6" );
        words.add( "7" );
        Object[] vals = words.toArray(  );
        assertEquals( "5", vals[0] );
        assertEquals( "6", vals[1] );
        assertEquals( "7", vals[2] );
        assertEquals( 3, vals.length );
    }

    /** Moo */
    @Test
    public void testToString(  ) {
        assertEquals( "[]", words.toString(  ) );
        words.add( "5" );
        words.add( "6" );
        words.add( "7" );
        assertEquals( "[5, 6, 7]", words.toString(  ) );
    }

    /** Moo */
    @Test
    public void testEquals(  ) {
        LinkedList<String> temp = new LinkedList<String>(  );
        temp.add( "5" );
        LinkedList<String> tempTwo = new LinkedList<String>(  );
        tempTwo.add( "5" );
        assertTrue( temp.equals( tempTwo ) );
    }
}