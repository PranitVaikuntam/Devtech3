/**
 * @author Pranit Vaikuntam
 */
public class RemoveLast<E> extends DoublyLinkedList<E>{
    @Override
    public E removeLast() {
        return super.removeFirst();
    }
}
