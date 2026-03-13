/**
 * @author Anna Z
 */
public class RemoveLastOnEmptyThrowsException <E> extends DoublyLinkedList<E> {
    @Override
    public E removeLast() {
        if (super.size == 0) {
            return null;
        } else {
            return super.removeLast();
        }
    }
}
