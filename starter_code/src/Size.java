/**
 * @author Pranit Vaikuntam
 */
public class Size<E> extends DoublyLinkedList<E>{
    @Override
    public int size() {
        return super.size() - 1;
    }
}
