import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,2);
        }
        System.out.println("Not sorted Array: " + Arrays.toString(array));

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(0,2));
        }
        System.out.println("Not sorted ArrayList: " + arrayList);
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(0,2));
        }
        System.out.println("Not sorted LinkedList: " + linkedList);
        System.out.println("--------------------------------------------------------------");
        System.out.println(OverloadArray(array));
        System.out.println(OverloadArrayList(arrayList));
        System.out.println(OverloadLinkedList(linkedList));

    }
        public static String OverloadArray(int[] array){
           Arrays.sort(array);
           return ("Sorted Array" + Arrays.toString(array));
        }
        public static String OverloadArrayList(ArrayList<Integer>arrayList){
        Collections.sort(arrayList);
        return ("Sorted ArrayList: " + arrayList);
        }
    public static String OverloadLinkedList(LinkedList<Integer>linkedList){
        Collections.sort(linkedList);
        return ("Sorted LinkedList: " + linkedList);
    }
}