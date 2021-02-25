package _10_dsa_danh_sach.Exercie._deploy_linked_list_methods;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> example = new MyLinkedList<String>();
        example.addFirst("A");
        example.add(1, "B");
        example.add(2, "C");
        example.addLast("Z");
        example.addFirst("K");
        example.remove(2);
        System.out.println(example.size());
        System.out.println(example.getFirst());
        System.out.println(example.getLast());
        example.printList();


    }
}
