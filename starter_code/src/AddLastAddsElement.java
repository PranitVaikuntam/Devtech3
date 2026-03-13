/**
 * @author grayson_replace_this
 * Doesn't set new last or edit old last
 */
public class AddLastAddsElement<E> extends DoublyLinkedList<E> {
    @Override
    public void addLast(E e) {
        Node<E> newLast = new Node<E>(last, e, null);
    }
}
