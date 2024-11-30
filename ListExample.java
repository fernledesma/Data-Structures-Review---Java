import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String args[]){

        List<String> list = new ArrayList<>();

        list.add("new");
        list.add("chocolates");
        list.add("make");
        list.remove(2);

        System.out.println("List elements: "+ list);

        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0,1);
        l1.add(1,2);

        System.out.println(l1);

        List<Integer> l2 = new ArrayList<Integer>();

        l2.add(1);
        l2.add(2);
        l2.add(3);

        l1.addAll(1, l2);

        System.out.println(l1);

        l1.remove(1);

        System.out.println(l1);

        System.out.println(l1.get(3));

        l1.set(0,5);

        System.out.println(l1);


        List<String> al = new ArrayList<>();

        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");

        System.err.println(al);

        /*
        al.set(2, "Me!");
        System.err.println("updated:"+al);
        */

        int index = al.indexOf("Geeks");
        System.out.println("The first occurence of Geeks is "+index);

        int lastIndex = al.lastIndexOf("Geeks");
        System.out.println("The second occurence of Geeks is "+lastIndex);
        al.remove(2);
        System.out.println("Before the object removal: " + al);
        al.remove("Geeks");
        System.out.println("After the object removal: "+ al);

        System.out.println("Remaining Objects: "+ al.get(0));

        boolean isPresent = al.contains("For");
        System.out.println("For");

        System.out.println("Is For present in the list?"+ isPresent);
        al.add("The");
        al.add("Once");
        al.add(2, "Moon");

        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i) + " ");
        }
        al.set(0, "We");
        al.set(1, "Reach");
        al.set(2, "Our");
        al.set(3, "Moon");
        System.out.println();
        for (String str: al){
            System.out.println(str + " ");
        }
    }
}
