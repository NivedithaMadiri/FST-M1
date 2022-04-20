package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap=new HashMap<Integer, String>();
        hmap.put(1,"pink");
        hmap.put(2,"red");
        hmap.put(3,"green");
        hmap.put(4,"yellow");
        hmap.put(5,"blue");
        System.out.println("Hashmap is :"+ hmap);
        System.out.println("Remove red color :"+ hmap.remove(2));
        System.out.println("Is green present in hashmap : "+ hmap.containsValue("green"));
        System.out.println("Size of the map :"+ hmap.size());
    }
}
