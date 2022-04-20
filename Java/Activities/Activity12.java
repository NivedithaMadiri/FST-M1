package activities;
interface addable{
    int add(int a, int b);
}
public class Activity12 {
    public static void main(String[] args) {
        addable ad1 =(a,b) ->(a+b);
        addable ad2 = (int a, int b)->{
            return (a+b);
        };
        System.out.println("Sum of numbers :" + ad1.add(20,50));
        System.out.println("Sum of numbers :"+ ad2.add(10,20));

    }
}
