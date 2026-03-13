/**
 * @author Pranit Vaikuntam
 */
public class RemoveFirst<E> extends DoublyLinkedList<E>{
    @Override
    public E removeFirst() {
        return super.removeLast();
    }
}
