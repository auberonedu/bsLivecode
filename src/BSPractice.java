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

        // Insert items in sorted order
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

        int low = 0; // the first index
        int high = items.size(); // the last index
        
        int mid; 

        // Binary search to find the position to insert
        while (low < high) {
            mid = low + (high - low) / 2;
            
            int midItem = items.get(mid);
            if (toInsert == midItem) {
                items.add(mid, toInsert);
                return;
            } else if (toInsert < midItem) {
                high = mid; // search in the left half
            } else {
                low = mid + 1; // search in the right half
            }
        }
        items.add(low, toInsert); // insert at the found position
        
    }
}