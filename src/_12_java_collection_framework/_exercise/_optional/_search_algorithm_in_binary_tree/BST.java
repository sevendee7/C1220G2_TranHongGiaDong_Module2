package _12_java_collection_framework.Exercice._optional._search_algorithm_in_binary_tree;


public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {}

    private TreeNode<E> createNewNode(E e) {
        TreeNode newNode = new TreeNode(e);
        return newNode;
    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
        } else {
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
            } else {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }

    @Override
    public boolean search(E e) {
        if (root == null) {
            System.out.println("Binary Tree is empty !");
            return false;
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.equals(current.element)) {
                    System.out.println(e + " is found in Binary Tree !");
                    return true;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else {
                    return false;
                }
            }
        }
        System.out.println(e + " is not found in Binary Tree !");
        return false;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
}
