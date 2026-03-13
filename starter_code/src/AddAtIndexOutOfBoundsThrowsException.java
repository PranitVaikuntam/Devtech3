/**
 * @author Pranit Vaikuntam
 */
public class AddAtIndexOutOfBoundsThrowsException<E> extends DoublyLinkedList<E> {
    @Override
    public void add(int index, E element) {
       super.addLast(element);
    }
}
