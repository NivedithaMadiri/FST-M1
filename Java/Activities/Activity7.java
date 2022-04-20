package activities;
 interface BicycleParts {
     public int gears=0;
     public int speed=0;
 }
 interface BicycleOperations{
     public void applyBrake(int decrement);
     public void SpeedUp(int increment);
 }
  class Bicycle implements BicycleParts, BicycleOperations{
      public int gears;
      public int speed;
  public Bicycle(int gears, int speed) {
     this.gears=gears;
     this.speed=speed;
  }
      public void applyBrake(int decrement){
       speed=speed-decrement;
       System.out.println("Speed:"+speed);
  }
  public  void SpeedUp(int increment){
      speed=speed+increment;
      System.out.println("speed :"+speed);
  }
  public String BicycleDesc(){
      return("gears:"+gears + "Speed :"+speed);
      }
     }
       class MountainBike extends Bicycle{
         public int seatHeight;
          public MountainBike(int gears, int speed, int Height){
              super(gears,speed);
              seatHeight=Height;

          }
          public void setHeight(int newValue){
              seatHeight=newValue;
          }
           public String BicycleDesc(){
               return("gears:"+ super.gears  + "Speed :" + super.speed + "Seat Height :"+seatHeight);
           }

        }

public class Activity7 {
    public static void main(String[] args) {
        MountainBike mb =new MountainBike(5,11,3);
        System.out.println(mb.BicycleDesc());
        mb.SpeedUp(15);
        mb.applyBrake(5);

    }
}
