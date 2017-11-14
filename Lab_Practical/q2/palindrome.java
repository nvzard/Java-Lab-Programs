import java.io.*;

class Test{

    String palindrome (String str) {

	    StringBuilder sb = new StringBuilder();

	    for (int i = str.length()-1; i>=0; i--) {
	            sb.append(str.charAt(i));
	    }

	    String string2 = sb.toString();

	    return string2;
    }

}

class Driver{
	    public static void main(String args[]) throws IOException {
		
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Input a string: ");
        String tmp = input.readLine();
		
        Test obj = new Test();
        
        if(tmp.equals(obj.palindrome(tmp)))
                System.out.println("It is palindrome");
                else
                System.out.println("It is not palindrome");
    }
}
	        	
