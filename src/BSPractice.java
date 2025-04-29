import java.util.*;

public class BSPractice {
    public static void main(String[] args) {
        List<Integer> items = new ArrayList<>();

        items.add(5);
        items.add(15);
        items.add(20);
        items.add(25);
        items.add(30);
        items.add(35);
        items.add(40);
        items.add(45);
        items.add(50);

        insert(items, 51);
        System.out.println(items);
        insert(items, 1);
        System.out.println(items);
        insert(items, 27);
        System.out.println(items);
        insert(items, 25);
        System.out.println(items);
        insert(items, 26);
        System.out.println(items);
        insert(items, 1);
        System.out.println(items);
        insert(items, 2);
        System.out.println(items);
        insert(items, 51);
        System.out.println(items);
        insert(items, 52);
        System.out.println(items);
    }

    public static void insert(List<Integer> items, int toInsert) {
        int low = 0;
        int high = items.size();

        int mid;

        while(low < high) {
            mid = low + (high - low) / 2;

            int midItem = items.get(mid);

            if(toInsert == midItem) {
                items.add(mid, toInsert);
                return;
            } else if(toInsert < midItem) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        items.add(low, toInsert);
    }
}