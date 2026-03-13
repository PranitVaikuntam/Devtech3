/**
 * @author grayson_replace_this
 * Doesn't set new first or edit old first
 */
public class AddFirstAddsElement<E> extends DoublyLinkedList<E> {
    @Override
    public void addFirst(E e) {
        Node<E> newFirst = new Node<E>(null, e, first);
    }
}
