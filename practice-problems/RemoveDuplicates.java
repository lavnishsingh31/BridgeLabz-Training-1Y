import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Create and populate ArrayList with duplicates
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);

        System.out.println("Original ArrayList: " + list);

        // Use HashSet to remove duplicates, then rebuild ArrayList
        Set<Integer> set = new HashSet<>(list);
        ArrayList<Integer> uniqueList = new ArrayList<>(set);

        System.out.println("ArrayList without duplicates: " + uniqueList);
    }
}