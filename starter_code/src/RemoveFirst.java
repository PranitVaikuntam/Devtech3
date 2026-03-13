/**
 * @author Pranit Vaikuntam
 */
public class RemoveFirst<E> extends DoublyLinkedList<E>{
    @Override
    public E remove(int index) {
        return super.removeLast();
    }
}
