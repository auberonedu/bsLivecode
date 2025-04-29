import java.util.ArrayList;
import java.util.List;

public class BSPractice {
    public static void main(String[] args) {
        List<Integer> items = new ArrayList<>();
        items.add(5);
        items.add(7);
        items.add(9);
        items.add(22);
        items.add(22);
        items.add(50);

        insert(items, 15);
        insert(items, 51);
        insert(items, 22);
        insert(items, 23);
        insert(items, -3);
        insert(items, -3);
        insert(items, 51);

        for (int item : items) {
            System.out.println(item);
        }

    }

    // Iterative Binary Search
    public static void insert(List<Integer> items, int toInsert) {
        // No need to throw any exception, other methods will handle that

        int low = 0;
        int high = items.size();

        int mid;

        while (low < high) {
            mid = low + (high - low) / 2;

            int midItem = items.get(mid);
            if (toInsert == midItem) {
                // .add(index of list where we want to add, value of what we want to add)
                items.add(mid, toInsert);
                return;
            } else if (toInsert < midItem) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        items.add(low, toInsert);
    }
}