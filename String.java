import java.util.*;
import java.util.stream.*;;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Stream is an interface btw.
class Main {
  
  public static void main(String[] args) {

    //LEXOGRAPHICALLY CHECK
    String A = "StringA";
        String B = "StringB";
        int result = A.compareTo( B );  
        if(result>0)
            System.out.println("A is lexicographically larger than B");
        else if(result<0)
            System.out.println("A is lexicographically smaller than B");
        else
            System.out.println("A is lexicographically equal to B");


    //UPPER AND LOWER CASE
    System.out.println("The Uppercase Value is : "+A.toUpperCase());
    System.out.println("The lowercase Value is : "+A.toLowerCase());


    //SUBSTRING.  first is start index, second is the last index. substring is taken from start(included) till end-1.
    System.out.println("First two letters capital and rest as it is : "+A.substring(0, 2).toUpperCase() + A.substring(2));

    //INTEGER TO STRING
    int number=99238232;
    String numberAsString = Integer.toString(number);
    String numberAsString2 = String.valueOf(number);//Both are right.

    
    //JAVA DATE AND TIME : visit this site : https://www.hackerrank.com/challenges/java-date-and-time/editorial
    //GOOD QUESTION  :  https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
    //GOOD QUESTION  :  https://www.hackerrank.com/challenges/java-anagrams/editorial
    //GOOD QUESTION  :  https://www.hackerrank.com/challenges/java-sort/editorial
    //int[][] arr = new int[10][10]; create 2D array like this.
    
    /*HashMap<String, Integer> hash = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            hash.put(name,phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            try
            {
                int out=hash.get(s);
                System.out.println(s+"="+out);
            }
            catch(Exception e)
            {
                System.out.println("Not found");
            }
        }*/


    
    
    
  }
}


