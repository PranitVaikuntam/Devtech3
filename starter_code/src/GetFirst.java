/**
 * @author Anna Z
 */
public class GetFirst<E> extends DoublyLinkedList<E> {
    // gets last element in list instead
    // if list is empty or has only one element return null instead
    @Override
    public E getFirst() {
        if(super.size == 0 || super.size == 1){
            return null;
        } else {
            return super.getLast();
        }
    }
}