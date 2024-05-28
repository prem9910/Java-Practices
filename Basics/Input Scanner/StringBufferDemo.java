
//StringBuffer class have several methods
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello");
        System.out.println("Initial StringBuffer: " + s);
        System.out.println("Length of StringBuffer: " + s.length());
        s.append(" World");
        System.out.println("After appending: " + s);
        s.insert(5, " Java");
        System.out.println("After inserting: " + s);
        s.delete(6, 11);
        System.out.println("After deleting: " + s);
        s.reverse();
        System.out.println("After reversing: " + s);
        System.out.println("Char at 1st index: " + s.charAt(0));
        System.out.println("Index of 'o': " + s.indexOf("o"));
        System.out.println("Last Index of 'o': " + s.lastIndexOf("o"));
        s.setCharAt(0, 'h');
        System.out.println("After replacing: " + s);
        s.setLength(10);
        System.out.println("After changing length: " + s);
        System.out.println("Capacity: " + s.capacity());
    }
}
