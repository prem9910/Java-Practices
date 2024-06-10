package Variables;

public class TypeCasting {
    
    //Type Casting
    
    public static void main(String[] args) {
        System.out.println("Type Casting: ");

        //Automatic Type Casting
        int intVar = 5;
        double doubleVar = intVar;
        System.out.println("intVar: " + intVar);
        System.out.println("doubleVar: " + doubleVar);

        //Manual Type Casting - Narrow Type Casting
        double doubleVar2 = 5.5;
        int intVar2 = (int) doubleVar2;
        System.out.println("doubleVar2: " + doubleVar2);
        System.out.println("intVar2: " + intVar2);

        //Advance Type Casting using string
        // primitive --> Non primitive

        float fl = 33.2f;
        String str = String.valueOf(fl);
        System.out.println("str: " + str);
        System.out.println("fl: " + fl+fl);

        //Non primitive --> primitive
        String str2 = "100";
        float fl2 = Float.parseFloat(str2);
        System.out.println("fl2: " + fl2+fl2);
        System.out.println("str2: " + str2);


  
    }
}
