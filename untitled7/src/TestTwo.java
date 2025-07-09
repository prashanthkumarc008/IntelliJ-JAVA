import java.util.ArrayList;
import java.util.Iterator;

public class TestTwo {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        System.out.println(enames.size());
        enames.add("Daniel");
        enames.add("john");
        enames.add("ananda");
        enames.add("pacchu");
        System.out.println("Size of the ArrayList"+enames.size());

        System.out.println("for loop section");


        System.out.println("for each section");
        for (String name : enames){
            System.out.println(name);
        }
        System.out.println("Iterator section ");
        Iterator<String> it = enames.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
