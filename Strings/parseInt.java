package Strings;

/*In Java, the parseInt() function is used to convert a string of numeric characters 
(digits) into an integer value. It is a built-in function provided by the Integer 
class.
The function returns an integer value that is equivalent to the numeric characters in 
the string.
If the string cannot be parsed into an integer, the function throws a 
NumberFormatException. This can happen if the string contains non-numeric characters or
if the value is too large or small to be represented as an integer. */

public class parseInt {
    public static void main(String[] args) {
        
    String str = "123";
    int number = Integer.parseInt(str);
    System.out.println(number);

    } 
}
