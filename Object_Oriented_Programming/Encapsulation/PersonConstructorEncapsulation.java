public class PersonConstructorEncapsulation {
    private String name;
    private int age;
    private String City;
    
    //Constructor
    public PersonConstructorEncapsulation(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.City = city;
    }
    
    //Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
        return City;
    }
    
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCity(String city) {
        this.City = city;
    }
    
    public static void main(String[] args) {
        PersonConstructorEncapsulation person = new PersonConstructorEncapsulation("Prem Prakash", 25, "Jaipur");
        
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("City: " + person.getCity());
    }
}
