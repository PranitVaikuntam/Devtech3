/**
 * @author Anna Z
 */
public class GetFirstOnEmptyThrowsException <E> extends DoublyLinkedList<E>{
    @Override
    public E getFirst(){
        if(super.size == 0){
            return null;
        } else {
            return super.getFirst();
        }
    }
}
