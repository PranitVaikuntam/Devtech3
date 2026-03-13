import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;


public class DoublyLinkedListTest {
    /**
     * Use this to toggle between using the DoublyLinkedList class and your broken classes
     * You may submit with either true or false.
     */
    boolean SHOULD_FAIL = false;

    private DoublyLinkedList<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new DoublyLinkedList<>();
    }

    // Tests for get

    /**
     * @author grayson_replace_this
     * @see GetAtOutOfBoundsThrowsException
     */
    @Test
    public void testGetAtOutOfBoundsThrowsException() {
        if (SHOULD_FAIL) list = new GetAtOutOfBoundsThrowsException<>();

        list.addLast(1);
        list.addLast(2);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(3));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }

    /**
     * @author Pranit Vaikuntam
     * @see GetAtIndex
     */
    @Test
    public void testGetAtIndex() {
        //fail("Not yet implemented");
        if (SHOULD_FAIL) list = new GetAtIndex<>();

        list.add(0, 1);
        list.add(1, 2);
        list.addFirst(0);
        list.addLast(3);
        assertEquals(0, list.get(0));
        assertEquals(1, list.get(1));
    }

    // Tests for getFirst
    /**
     * @author Pranit Vaikuntam
     * @see GetFirst
     */
    @Test
    public void testGetFirst() {
        //fail("Not yet implemented");
        if (SHOULD_FAIL) list = new GetAtIndex<>();

        list.add(0, 1);
        list.add(1, 2);
        list.addFirst(0);
        list.addLast(3);
        assertEquals(0, list.getFirst());

        list.removeFirst();
        assertEquals(1, list.getFirst());

    }

    // Tests for getLast
    /**
     * @author Pranit Vaikuntam
     * @see GetLast
     */
    @Test
    public void testGetLast() {
        //fail("Not yet implemented");
        if (SHOULD_FAIL) list = new GetLast<>();

        list.add(0, 1);
        list.add(1, 2);
        list.addFirst(0);
        list.addLast(3);
        assertEquals(3, list.getLast());
    }

    /**
     * @author Pranit Vaikuntam
     * @see GetFirstOnEmptyThrowsException*
     */
    @Test
    public void testGetFirstOnEmptyThrowsException(){
        if(SHOULD_FAIL){
            list = new GetFirstOnEmptyThrowsException<>();
        }

        assertThrows(NoSuchElementException.class, () -> list.getFirst());

    }

    /**
     * @author Pranit Vaikuntam
     * @see GetLastOnEmptyThrowsException*
     */
    @Test
    public void testGetLastOnEmptyThrowsException(){
        if(SHOULD_FAIL){
            list = new GetLastOnEmptyThrowsException<>();
        }

        assertThrows(NoSuchElementException.class, () -> list.getLast());
    }

    // Tests for isEmpty
    /**
     * @author Pranit Vaikuntam
     * @see IsEmpty
     */
    @Test
    public void testIsEmpty() {
        //fail("Not yet implemented");
        if (SHOULD_FAIL) list = new IsEmpty<>();

        list.add(0, 1);
        list.removeLast();
        assertTrue(list.isEmpty());

        list.addFirst(0);
        list.addLast(3);
        assertFalse(list.isEmpty());
    }

    /**
     * @author Pranit Vaikuntam
     * @see IsEmptyWhenCreated
     */
    @Test
    public void testIsEmptyWhenCreated() {
        if (SHOULD_FAIL) list = new IsEmptyWhenCreated<>();
        assertTrue(list.isEmpty());
    }

    // Tests for add

    /**
     * @author Anna Z
     * @see AddAtIndexOutOfBoundsThrowsException
     */
    @Test
    public void testAddAtIndexOutOfBoundsThrowsException() {
        //    fail("Not yet implemented");
        if(SHOULD_FAIL){
            list = new AddAtIndexOutOfBoundsThrowsException<>();
        }
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(1, 1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(-1, 1));
    }

    // Tests for addFirst

    /**
     * @author Anna Z
     * @see AddFirstAddsElement
     */
    @Test
    public void testAddFirstAddsElement() {
        //fail("Not yet implemented");

        if(SHOULD_FAIL){
            list = new AddFirstAddsElement<>();
        }

        assertTrue(list.isEmpty());

        list.addFirst(1);
        assertEquals(1, list.getFirst());

        list.addFirst(2);
        assertEquals(2, list.getFirst());

    }

    // Tests for addLast

    /**
     * @author Anna Z
     * @see AddLastAddsElement
     */
    @Test
    public void testAddLastAddsElement() {
        //    fail("Not yet implemented");

        if(SHOULD_FAIL){
            list = new AddLastAddsElement<>();
        }

        assertTrue(list.isEmpty());

        list.addLast(1);
        assertEquals(1, list.getLast());

        list.addLast(2);
        assertEquals(2, list.getLast());

    }

    // Tests for remove

    /**
     * @author Anna Z
     * @see RemoveAtIndex
     */
    @Test
    public void testRemoveAtIndex() {
        //   fail("Not yet implemented");

        if(SHOULD_FAIL){
            list = new RemoveAtIndex<>();
        }

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        list.remove(1);
        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(2));

    }

    // Tests for removeFirst
    /**
     * @author Anna Z
     * @see RemoveFirst
     */
    @Test
    public void testRemoveFirst(){

        if(SHOULD_FAIL){
            list = new RemoveFirst<>();
        }

        list.addLast(1);
        list.addLast(2);

        list.removeFirst();
        assertNotEquals(1, list.getFirst());

    }

    // Tests for removeLast
    /**
     * @author Anna Z
     * @see RemoveLast
     */
    @Test
    public void testRemoveLast(){

        if(SHOULD_FAIL){
            list = new RemoveLast<>();
        }

        list.addLast(1);
        list.addLast(2);

        list.removeLast();
        assertNotEquals(2, list.getFirst());

    }

    /**
     * @author Pranit Vaikuntam
     * @see RemoveFirstOnEmptyThrowsException*
     */
    @Test
    public void testRemoveFirstOnEmptyThrowsException(){
        if(SHOULD_FAIL){
            list = new RemoveFirstOnEmptyThrowsException<>();
        }

        assertThrows(NoSuchElementException.class, () -> list.removeFirst());

    }

    /**
     * @author Pranit Vaikuntam
     * @see RemoveLastOnEmptyThrowsException*
     */
    @Test
    public void testRemoveLastOnEmptyThrowsException(){
        if(SHOULD_FAIL){
            list = new RemoveLastOnEmptyThrowsException<>();
        }

        assertThrows(NoSuchElementException.class, () -> list.removeLast());
    }

    // Tests for size
    /**
     * @author Anna Z
     * @see Size
     */
    @Test
    public void testSize(){

        if(SHOULD_FAIL){
            list = new Size<>();
        }

        assertEquals(0, list.size());

        list.addLast(1);
        list.addLast(2);

        assertEquals(2, list.size());

    }

    // Tests for set
    /**
     * @author Anna Z
     * @see Set
     */
    @Test
    public void testSet(){

        if(SHOULD_FAIL){
            list = new Set<>();
        }

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        list.set(1, 99);
        assertEquals(1, list.get(0));
        assertEquals(99, list.get(1));

    }

}
