/**
 * @author Pranit Vaikuntam
 */
public class RemoveAtIndex<E> extends DoublyLinkedList<E>{
    @Override
    public E remove(int index) {
        return super.remove(index - 1);
    }
}
