/**
 * @author Anna Z
 */
public class IsEmpty<E> extends DoublyLinkedList<E> {
    // returns the opposite of if the list is empty
    @Override
    public boolean isEmpty() {
        return !super.isEmpty();
    }
}