import java.util.*;


class Driver{

    public static void main(String args[]){

    String sentence = "If you are good at something never do it for free";
    String exp = "10 + 20 + 40 / 60";

    StringTokenizer sent = new StringTokenizer(sentence, " ");

    while(sent.hasMoreTokens())
        System.out.println(sent.nextToken());

    }
}
