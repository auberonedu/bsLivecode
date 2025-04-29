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
        insert(items, 51);
        insert(items, 22);
        insert(items, 23);
        insert(items, -3);
        insert(items, -3);

        System.out.println(items);
    }

    public static void insert(List<Integer> items, int toInsert) {
        int low = 0; // Low is the first index of the list/array
        int high = items.size(); // high is the maximum size of the list/array

        int mid; // calling a variable called mid for the mid point

        while(low < high) {
            mid = low + (high - low) / 2; // mid is the mid point of the the list/array

            int midItem = items.get(mid);
            if(toInsert == midItem) {       // If the toInsert param is == to midItem, then we will add toInsert to the middle index
            //   list.add(index,  what to insert)
                items.add(mid, toInsert);
                return;
            } else if (toInsert < midItem) {    // If toInsert is less than midItem, then we set high to the middle index
                high = mid;
                // high = mid - 1  --- this will not put the inserted nums not in sorted order, try it out and see what happens.
                // what will happen is that, the new insertion will be inserted at the middle index - 1 
            } else {            // Else, we set low to the mid index + 1 index
                low = mid + 1;
            }
        }
        items.add(low, toInsert);  // we'll add the insertItem at the low if the number is lower than current number at index 0;
    }
}