import java.util.ArrayList;

public class TestOne {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println(list);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        for (Integer lists:list){
            System.out.println(lists);
        }

    }
}
