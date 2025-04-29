import java.util.ArrayList;
import java.util.List;

public class BSPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            list.add(i);
        }

        insert(list, 7);

        System.out.println(list);

        List<Integer> items = new ArrayList<>();
        items.add(5);
        items.add(7);
        items.add(9);
        items.add(22);
        items.add(22);
        items.add(50);

        insert(items, 15);
        insert(items, 51);
        insert(items, 51);
        insert(items, 22);
        insert(items, 23);
        insert(items, -3);
        insert(items, -3);

        System.out.println(items);
    }

    public static void insert(List<Integer> items, int toInsert) {
        int low = 0;
        int high = items.size();

        int mid;

        while (low < high) {
            mid = low + (high - low) / 2;

            int midItem = items.get(mid);

            if (toInsert == midItem) {
                items.add(mid, toInsert);
                return;
            } else if (toInsert < midItem) {
                // Maybe mid - 1
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        items.add(low, toInsert);
    }
}