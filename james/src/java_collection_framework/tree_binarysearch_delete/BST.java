package java_collection_framework.tree_binarysearch_delete;

public class BST <E extends Comparable<E>> extends AbstractTree<E>{
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {}

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }
    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e);
        else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
            } else
                parent.right = createNewNode(e);
        }
        size++;
        return true;
    }
    public int getSize() {
        return size;
    }

    public void posterder() {
        posterder();
    }

    public void inorder() {
        inorder(root);
    }
    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
    public void preorder() {
        preorder(root);
    }

    protected void preorder(TreeNode<E> root) {
        if( root == null ) return;
        System.out.println(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }

    protected TreeNode<E> deleteNode(TreeNode<E> root, E e) {
        if (root == null) return root;
        if (e.compareTo(root.element) < 0 )
            root.left = deleteNode(root.left, e);
        else if (e.compareTo(root.element) > 0)
            root.right = deleteNode(root.right, e);
        else {
            if(root.left == null) {
                root = root.right;
            } else if (root.right == null) {
                root = root.left;
            } else  {
                TreeNode<E> temp = root.right;
                while (temp.left != null) {
                    temp = temp.left;
                }
                root.element = temp.element;
                root.right = deleteNode(root.right, temp.element);
            }
        }
        return root;
    }
    public boolean delete(E e) {
        deleteNode(this.root, e);
        size--;
        return true;
    }

    public boolean search(E e) {
        if (root == null) {
            return false;
        }
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current =current.left;
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }
}
