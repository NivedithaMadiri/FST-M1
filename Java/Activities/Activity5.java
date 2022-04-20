package activities;

abstract class Book {
   String Title;
   abstract void setTitle(String A);
   String  getTitle(){
 return Title;
   }
        }
         class MyBook extends Book{
public void setTitle(String A){
    Title=A;
}
}
public class Activity5 {
    public static void main(String[] args) {
        String Title = "Harry Potter Series";
 MyBook newNovel= new MyBook();
 newNovel.setTitle(Title);
 System.out.println("Title of the Book : "+newNovel.getTitle());
    }
}
