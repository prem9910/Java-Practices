public class BasicCarClass {
    
    String model;
    int year;
    String color;


    //Method to display car details
    void displayDetails(){
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
        System.out.println("Color : " + color);
    }
    public static void main(String[] args) {
        //Creating an Object of Basic Car Class
        BasicCarClass myCar = new BasicCarClass();

        myCar.model = "Mustang";
        myCar.year = 1969;
        myCar.color = "Red";
        myCar.displayDetails();     

    }

}
