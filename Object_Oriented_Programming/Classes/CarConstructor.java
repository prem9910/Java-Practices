public class CarConstructor {
    String model;
    int year;
    String color;

    //Constructor to initialize attributes
    CarConstructor(String model, int year, String color){
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method to display car details

    void displayDetails(){
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
        System.out.println("Color : " + color);
    }

    public static void main(String[] args) {
        //Creating an Object of Basic Car Class
        CarConstructor myCar = new CarConstructor("Toyota", 2020, "Red");

        myCar.displayDetails();
    }
}