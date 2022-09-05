package java_collection_framework.install_binary_searchtree;

public interface Tree<E> {
    boolean insert(E e);
    void inorder();
    int getSize();
}
