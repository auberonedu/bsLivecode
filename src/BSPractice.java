import java.util.ArrayList;
import java.util.List;

public class BSPractice {
    public static void main(String[] args) {
        List<Integer> items = new ArrayList<>();
        items.add(5);
        items.add(7);
        items.add(8);
        items.add(15);
        items.add(23);
        items.add(35);
        items.add(56);

        insert(items, 15);
        System.out.println("Hello world");
        System.out.println(items);
    }

    public static void insert(List<Integer> items, int toInsert){
        int low = 0;
        int high = items.size();

        int mid;

        while(low<high){
            mid = low + (high-low) /2;

            int midItem = items.get(mid);
            if(midItem == toInsert){
                items.add(mid, toInsert);
            }else if(toInsert < midItem){
                high = mid;
            } else {
                low = mid + 1;
            }

        }
        items.add(low, toInsert);
    }
}