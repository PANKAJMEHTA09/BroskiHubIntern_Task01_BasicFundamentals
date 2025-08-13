package Task1;

import java.util.*;
public class BasicFundamental{

    public static boolean checkinput(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

   boolean result = checkinput(input);

   if(result==true){
       System.out.println("OUR NUMBER IS EVEN" + input);
   }
   else{
       System.out.println("OUR NUMBER IS ODD " + input);
   }



}}