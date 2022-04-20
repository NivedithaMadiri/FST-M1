package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("Nive");
        mylist.add("Ravi");
        mylist.add("Karthi");
        mylist.add("Srini");
        mylist.add("Dave");
        for (String s:mylist){
            System.out.println("Name in the Arraylist :"+s);
        }
        System.out.println("3rd name in the array list :"+mylist.get(2));
        System.out.println("Is Satish in the list"+mylist.contains("Satish"));
        System.out.println("Size of the array list :"+mylist.size());
        mylist.remove("Dave");
        System.out.println("list after name removal :"+mylist);

    }
}
