/**
 * @author Pranit Vaikuntam
 */
public class RemoveLast<E> extends DoublyLinkedList<E>{
    @Override
    public E remove(int index) {
        return super.removeFirst();
    }
}
