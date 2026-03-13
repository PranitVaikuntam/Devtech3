/**
 * @author Pranit Vaikuntam
 */
public class AddFirstAddsElement<E> extends DoublyLinkedList<E> {
    @Override
    public void addFirst(E e) {
        super.addLast(e);
    }
}
