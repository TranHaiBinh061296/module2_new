package java_collection_framework.tree_binarysearch_delete;

public interface Tree<E> {
    public boolean insert(E e);
    public void postorder();
    public void inorder();
    void preorder();
    int getSize();
    boolean delete(E e);
    boolean search(E e);
}