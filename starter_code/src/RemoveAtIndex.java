/**
 * @author grayson_replace_this
 * Doesn't edit prev and next nodes
 */
public class RemoveAtIndex<E> extends DoublyLinkedList<E>{
    @Override
    public E remove(int index) {
        Node<E> removeNode = node(index);
        removeNode.prev = null;
        removeNode.next = null;

        return removeNode.item;
    }
}
