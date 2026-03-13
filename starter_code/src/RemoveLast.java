/**
 * @author grayson_replace_this
 * Doesn't edit prev node or set last node
 */
public class RemoveLast<E> extends DoublyLinkedList<E>{
    @Override
    public E remove(int index) {
        Node<E> removeNode = node(index);
        removeNode.prev = null;

        return removeNode.item;
    }
}
