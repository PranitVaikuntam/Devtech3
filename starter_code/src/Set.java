/**
 * @author Pranit Vaikuntam
 */
public class Set<E> extends DoublyLinkedList<E>{
    @Override
    public E set(int index, E element) {
        return super.set(index - 1, element);
    }
}
