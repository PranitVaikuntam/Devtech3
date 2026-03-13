/**
 * @author Anna Z
 */
public class GetLastOnEmptyThrowsException <E> extends DoublyLinkedList<E>{
    @Override
    public E getLast(){
        if(super.size == 0){
            return null;
        } else {
            return super.getLast();
        }
    }
}