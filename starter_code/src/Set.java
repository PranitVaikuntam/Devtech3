/**
 * @author grayson_replace_this
 * Doesn't edit prev node or set last node
 */
public class Set<E> extends DoublyLinkedList<E>{
    @Override
    public E set(int index, E element) {
        Node<E> newNode = node(index);
        newNode.item = element;
        return element;
    }
}
