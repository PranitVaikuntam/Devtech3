/**
 * @author Pranit Vaikuntam
 */
public class AddAtIndexOutOfBoundsThrowsException<E> extends DoublyLinkedList<E> {
    @Override
    public void add(int index, E element) {
       int newIndex = Math.min(super.size() - 1, Math.max(0, index));
       super.add(newIndex, element);
    }
}
