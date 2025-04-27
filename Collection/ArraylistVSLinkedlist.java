package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArraylistVSLinkedlist {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.get(1); // Akses elemen dengan indeks cepat (O(1))
        arrayList.remove(1); // Penghapusan di tengah (O(n))
        System.out.println(arrayList);
        System.out.println();
        System.out.println();
        System.out.println();

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.get(1); // Akses elemen dengan indeks lambat (O(n))
        linkedList.removeFirst(); // Penghapusan dari awal (O(1))
        System.out.println(linkedList);
    }
}
