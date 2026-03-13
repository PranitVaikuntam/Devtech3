/**
 * @author grayson_replace_this
 * Doesn't edit next node or set first node
 */
public class RemoveFirst<E> extends DoublyLinkedList<E>{
    @Override
    public E remove(int index) {
        Node<E> removeNode = node(index);
        removeNode.next = null;

        return removeNode.item;
    }
}
