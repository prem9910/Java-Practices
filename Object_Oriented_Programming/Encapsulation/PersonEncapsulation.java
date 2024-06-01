public class PersonEncapsulation {
    private String name;
    private int age;
    private String city;
    
     
    //Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }
    
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public static void main(String[] args) {
        
        PersonEncapsulation person = new PersonEncapsulation();
        person.setName("Prem Prakash");
        person.setAge(25);
        person.setCity("Jaipur");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("City: " + person.getCity());
    }
}
