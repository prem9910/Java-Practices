package Basics.Variables.Practical_Questions;
public class TemperatureConversion {
    public static void main(String[] args) {
        float celsius = 36.6f;
        float fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " °C = " + fahrenheit + " °F");

        fahrenheit = 98.0f;
        celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + " °F = " + celsius + " °C");
    }
}
