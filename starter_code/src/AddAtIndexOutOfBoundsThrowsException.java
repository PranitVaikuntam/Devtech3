/**
 * @author grayson_replace_this
 * Doesn't set new last or edit old last
 */
public class AddAtIndexOutOfBoundsThrowsException<E> extends DoublyLinkedList<E> {
    @Override
    public void add(int index, E element) {
       int newIndex = Math.min(super.size() - 1, Math.max(0, index));
       super.add(newIndex, element);
    }
}
