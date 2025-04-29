import java.util.*;

public class BSPractice {
    public static void main(String[] args) {   
        List<Integer> sortedArray = new ArrayList<>();
        sortedArray.add(5);
        sortedArray.add(7);
        sortedArray.add(9);
        sortedArray.add(22);
        sortedArray.add(22);
        sortedArray.add(50);

        System.out.println(sortedArray);
        insert(sortedArray, 15);
        insert(sortedArray, 51);
        insert(sortedArray, 51);
        insert(sortedArray, 22);
        insert(sortedArray, 23);
        insert(sortedArray, -3);
        insert(sortedArray, -3);
        System.out.println(sortedArray);
    }

    
    // Let's make a binary search!
    public static void insert(List<Integer> items, int toInsert) {
        int low = 0;
        int high = items.size();

        while (low < high) {
            int mid = low + (high - low) / 2;
            // grab value in the middle
            int midItem = items.get(mid);

            if (toInsert == midItem) {
                items.add(mid, toInsert); // insert at designated index. List handles the shuffle.
                return;
            } else if (toInsert < midItem) {
                // change high to mid (maybe mid - 1?)
                high = mid;
            } else if (toInsert > midItem) {
                // change low to mid + 1
                low = mid + 1;
            }
        }
        items.add(low, toInsert);
    }
}