/**
 * @author Anna Z
 */
public class GetLast<E> extends DoublyLinkedList<E> {
    // gets first element in list instead
    // if list is empty or has only one element return null instead
    @Override
    public E getLast() {
        if(super.size == 0 || super.size == 1){
            return null;
        } else {
            return super.getFirst();
        }
    }
}