enum Employee{
    MANAGER, DEVELOPER, DESIGNER;

    public void work(){
        System.out.println("Working");
    }
}

enum Salary{
    LOW, MEDIUM, HIGH
}   



public class Enum{
    public static void main(String[] args) {

        // Employee employee = Employee.MANAGER;
        // employee.work();
        Employee employee[] = Employee.values();
        System.out.println(employee);


        // for(int i = 0; i < employee.length; i++){
        //     System.out.println(employee[i]);
        // }

        for (Employee e : employee) {
            System.out.println(e);
            
            
        }
    }
}