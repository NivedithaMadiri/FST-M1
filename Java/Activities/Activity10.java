package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("four");
        hs.add("five");
        hs.add("six");
        System.out.println(" hashset is :"+ hs);
        System.out.println("Size of the hashset is :"+ hs.size());
        System.out.println("Remove three from hashset " +hs.remove("three"));
        if (hs.remove("eight")){
            System.out.println("eight removed from set");
        }
        else{
            System.out.println("eight is not present in the set");
        }

        System.out.println("Contains in the hashset"+ hs.contains("seven"));
        System.out.println("Updated hashset"+ hs);
    }
}
