package _10_dsa_danh_sach.Exercie._deploy_array_list_methods;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> listInterger = new MyArrayList<Integer>(6);
        listInterger.add(0, 4);
        listInterger.add(1, 3);
        listInterger.add(2, 2);
        listInterger.add(3, 1);
        listInterger.add(4, 0);

        System.out.println(listInterger.contains(4));
        System.out.println(listInterger.indexOf(4));
        System.out.println(listInterger.get(3));
        System.out.println(listInterger.size());
        System.out.println(listInterger.add(5));
        System.out.println(listInterger);
        listInterger.remove(3);
        System.out.println(listInterger);
        System.out.println(listInterger.size());

        MyArrayList<Integer> listClone = new MyArrayList<Integer>();
        listClone = listInterger.clone();
        System.out.println("List after clone: ");
        System.out.println(listClone);
        listClone.clear();
        System.out.println(listClone);
    }
}
