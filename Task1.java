package GroupProject2;

public class Task1 {
    public static void main(String[] args) {
        //Write a program to swap 2 String without a temporary variable?

        String a = "Hello";
        String b = "World";
        System.out.println("Strings before swap: a = " +
                a + " and b = "+b);

        // append 2nd string to 1st:
        a = a + b;
        // store initial string a in string b
        b = a.substring(0,a.length()-b.length()); // 0,10-5=5(Hello)
        // store initial string b in string a
        a = a.substring(b.length()); // HelloWorld= 5=initial index, 9=final index

        System.out.println("Strings after swap: a = " +
                a + " and b = " + b);
    }
}
