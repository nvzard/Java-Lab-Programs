import java.util.*;

class Palindrome{

    public static void main(String args[]){

        String original, reverse ="";
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        original = in.nextLine();

        int length = original.length();

        for(int i=length-1; i>=0; i--)
            reverse = reverse + original.charAt(i);

        if(original.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}
