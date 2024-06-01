public class CarGettersSetters {
    private String model;
    private int year;
    private String color;
    
    
    //getter and setter methods for the model, year, and color attributes

    public String getModel() {
        
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void displayDetails(){
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
        System.out.println("Color : " + color);
    }


    public static void main(String[] args) {
        //Creating an Object of Basic Car Class
        CarGettersSetters myCar = new CarGettersSetters();
        myCar.setColor("Blue");
        myCar.setModel("BMW");
        myCar.setYear(2021);
        myCar.displayDetails();

    }
}
