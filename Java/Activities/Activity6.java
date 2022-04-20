package activities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.Thread.sleep;

class Plane{
    private  int  MaxPassengers;
    private List<String> Passengers;
    private   Date takeoff;
    private   Date landing;
    Plane(int  MaxPassengers){
        this.MaxPassengers=MaxPassengers;
        this.Passengers= new ArrayList<>();
    }
    public void onboard(String Passenger){
        this.Passengers.add(Passenger);
    }
     public Date takeoff(){
        this.takeoff=new Date();
        return takeoff;
     }
     public void landing(){
        this.landing= new Date();
         this.Passengers.clear();
     }
    public Date getLastTimeLanded() {
        return landing;
    }

    public List<String> getPassengers() {
        return Passengers;
    }

}
public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
        plane.onboard("Niveditha");
        plane.onboard("Ravi");
        plane.onboard("Karthi");
System.out.println("Plane Take off Time ; "+ plane.takeoff());
System.out.println("List of Passengers : "+ plane.getPassengers());
sleep(5);
plane.landing();
System.out.println("Plane landed at :"+plane.getLastTimeLanded());
        System.out.println("Passengers after landing  :"+plane.getPassengers());
    }
}
