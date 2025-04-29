import java.util.ArrayList;
import java.util.List;

public class BSPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(13);
        list.add(25);
        list.add(34); 
        insert(list, 4);
        System.out.println(list);
    }
    public static void insert(List<Integer> items, int toInsert){
        int low = 0;
        int high = items.size();

        int mid;

        while(low < high){
            mid = low + (high-low)/ 2;
            int midItem = items.get(mid);
            if(toInsert == midItem){
                items.add(mid, toInsert);
                return;
            }else if(toInsert < midItem){
                //double-check
                high = mid;
            }else if(toInsert > midItem){
                low = mid + 1;
            }
        }
        items.add(low, toInsert);
    } 
}