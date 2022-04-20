package activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    Car() {
        tyres=4;
        doors=4;
    }
    public void displaycharacteristics()
    {
        System.out.println("The color of the car:"+color);
        System.out.println("The number of doors:"+doors);
        System.out.println("Transmission of the car:"+transmission);
        System.out.println("Make of the car:"+make);
        System.out.println("The number of tyres:"+tyres);

    }

    public void accelarate(){
        System.out.println("The car moves forward");
    }

    public void brake(){
        System.out.println("The car Stops");
    }
}

