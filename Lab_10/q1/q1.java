import java.util.*;


class Driver{

    public static void main(String args[]){

    String sentence = "If you are good at something never do it for free";
    String expression = "10 + 2 + 40 / 60";

    StringTokenizer sent = new StringTokenizer(sentence, " ");

    System.out.println("Sentence:\n");
    System.out.println("No of Tokens: "+ sent.countTokens());
    while(sent.hasMoreTokens())
        System.out.println(sent.nextToken());
    

/*
    StringTokenizer expression = new StringTokenizer(exp," ");
    
    while(expression.hasMoreTokens()){
        if(expression.nextToken() == (int) expression.nextToken())
            System.out.println(expression.nextToken());
    }

*/

    StringTokenizer exp = new StringTokenizer(expression," ");
    System.out.println("\nExpression:\n");
    System.out.println("No of Tokens: "+exp.countTokens());
    while(exp.hasMoreTokens())
        System.out.println(exp.nextToken());
    
    }
}
