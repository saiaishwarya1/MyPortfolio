package Assingment26Aug;
import java.util.Scanner;

class Condition {

public static long power(int n, int p) throws Exception
{
if(n == 0 && p == 0)
throw new Exception("n and p should not be zero.");
else if(n < 0 || p < 0)
throw new Exception("n or p should not be negative.");
else
return (long)(Math.pow(n,p));
}

}
public class MyCalculator{

public static final Condition my_calculator = new Condition();
public static final Scanner in = new Scanner(System.in);

public static void main(String[] args) {
while (in .hasNextInt()) {
int n = in .nextInt();
int p = in .nextInt();

try {
System.out.println(Condition.power(n, p));
} catch (Exception e) {
System.out.println(e);
}
}
}
}