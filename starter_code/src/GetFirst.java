/**
 * @author Anna Z
 */
public class GetFirst<E> extends DoublyLinkedList<E> {
    // returns null
    @Override
    public E getFirst() {
        if(super.size == 0 || super.size == 1){
            return null;
        } else {
            return super.getLast();
        }
    }
}