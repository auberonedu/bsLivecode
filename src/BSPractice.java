import java.util.*;

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
        System.out.println(items);
        
        insert(items, 51);
        System.out.println(items);

        insert(items, 51);
        System.out.println(items);

        insert(items, 22);
        System.out.println(items);

        insert(items, 23);
        System.out.println(items);

        insert(items, -3);
        System.out.println(items);

        insert(items, -3);
        System.out.println(items);
    }
    public static void insert(List<Integer> items, int toInsert) {
        //if we use .size() on this data structure before we send it 
        //to this insert() method and it's null
        //then .size() will throw NPE!
        // if(items==null) throw new NullPointerException();
        int low = 0;
        int high = items.size();
        
        int mid;

        while(low<high) {
            mid=low+(high-low)/2;
            int midItem=items.get(mid);
            if(toInsert == midItem) {
                items.add(mid, toInsert);//.add(index, value)
                return;
            } else if(toInsert<midItem){
                //maybe mid-1?
                high=mid;
            } else {
                low=mid+1;
            }
        }
        items.add(low, toInsert);
    }
}