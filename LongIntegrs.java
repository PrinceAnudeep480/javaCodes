import java.math.BigInteger;
import java.util.*;
public class LongIntegrs{
  public static void main(String...ar)throws Exception{
     Scanner scan = new Scanner(System.in);
     System.out.println("enter the first value");
     String temp = scan.nextLine();
     BigInteger bvalue1= new BigInteger(temp);
     System.out.println("enter the Second value");
     String temp1 = scan.nextLine();
     BigInteger bvalue2= new BigInteger(temp1);
     BigInteger sum=bvalue1.add(bvalue2);
     String temp2="100000";
     BigInteger cmrange=new BigInteger(temp2);
     BigInteger value=sum.multiply(cmrange);
     System.out.println("sum of two numbers is :" +value);
     }
}
