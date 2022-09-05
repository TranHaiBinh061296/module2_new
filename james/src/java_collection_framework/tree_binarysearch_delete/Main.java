package java_collection_framework.tree_binarysearch_delete;

public class Main {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.insert(27);
        tree.insert(14);
        tree.insert(10);
        tree.insert(19);
        tree.insert(35);
        tree.insert(31);
        tree.insert(42);
        System.out.println("inorder: ");
        tree.inorder();
        System.out.println("Số nút là: " + tree.getSize());

        //xóa
        System.out.println("Xóa 35");
        if (tree.search(35)) {
            System.out.println("Danh sách có số  35");
        } else System.out.println("Không có số 35 trong danh sách");
        tree.delete(35);
        System.out.println("inorder");
        tree.inorder();
        System.out.println("The number of nodes is " + tree.getSize());
        System.out.println("after delete 35");
        if (tree.search(35)) {
            System.out.println("tree have 35");
        } else System.out.println("tree have not 35");

        if(tree.search(42)) {
            System.out.println("tree have 42");
        } else System.out.println("tree have not 42");
    }
}
