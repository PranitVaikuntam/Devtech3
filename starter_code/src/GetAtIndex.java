/**
 * @author Anna Z
 */
public class GetAtIndex<E> extends DoublyLinkedList<E> {
    // shifts get index up by 1, overflowing to 0 if getting last element in list
    @Override
    public E get(int index){
        if(super.size == 0){
            return null;
        } else if(index == super.size() - 1){
            return super.get(0);
        } else {
            return super.get(index + 1);
        }
    }
}