package _12_java_collection_framework.Exercice._optional._search_algorithm_in_binary_tree;

public interface Tree<E> {
    public boolean insert(E e);

    public boolean search(E e);

    public void inorder();

    public int getSize();
}
