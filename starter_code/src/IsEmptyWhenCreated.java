/**
 * @author Anna Z
 */
public class IsEmptyWhenCreated<E> extends DoublyLinkedList<E> {
    // gets first element in list instead
    // if list is empty or has only one element return null instead
    IsEmptyWhenCreated (){
        super();
        super.addFirst(null);
    }
}