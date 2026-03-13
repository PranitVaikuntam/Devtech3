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
     * @author
     * @see
     */
    @Test
    public void testGetAtIndex() {
        fail("Not yet implemented");
    }

    // Tests for getFirst

    // Tests for getLast

    // Tests for isEmpty

    /**
     * @author
     * @see
     */
    @Test
    public void testIsEmptyWhenCreated() {
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
        fail("Not yet implemented");

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
    public void testRemoveFirst(){

        if(SHOULD_FAIL){
            list = new RemoveLast<>();
        }

        list.addLast(1);
        list.addLast(2);

        list.removeLast();
        assertNotEquals(2, list.getFirst());

    }

    // Tests for size
    /**
     * @author Anna Z
     * @see Size
     */
    @Test
    public void testRemoveFirst(){

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
    public void testRemoveFirst(){

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