import java.util.*;
public class SetExample {
    public static void main(String[] args){
    Set<String> hs = new HashSet<String>();

    hs.add("B");
    System.out.println("Set is "+hs);
    hs.add("B");
    System.out.println("Set is "+hs);
    hs.add("C");
    System.out.println("Set is "+hs);
    hs.add("A");

    System.out.println("Set is "+hs);

    String checkChars = "D";

    System.out.println("Contains "+ checkChars + " "+hs.contains(checkChars));

    hs.remove("B");

    System.out.println("After removing element "+hs);

    for(String value: hs){
        System.out.print(value+ " ");
    }
    System.out.println();
    }
}
