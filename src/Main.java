import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

         ArrayList<String> names = new ArrayList<>();
         names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Emma");

     //System.out.println(names.get(0) );
      //System.out.println(names.get(4));

        for (String str : names) {

            System.out.println(str);

        }

        System.out.println(names.size());

        System.out.println("Does names contain Alice?");
        System.out.println(names.contains("Alice"));

        System.out.println("Does names contain Ethan");
        System.out.println(names.contains("Ethan"));

        names.remove(3);
        System.out.println(names);

        names.set(2, "Daniel");
        System.out.println(names.get(2));

        Collections.sort(names);
        System.out.println(names);

        names.clear();
        System.out.println(names);













        }

        }


