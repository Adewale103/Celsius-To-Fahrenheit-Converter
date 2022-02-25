
import java.util.Scanner;
public class CelsiusConverter{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the degree in celsius: ");
	double c = input.nextDouble();
	double f = ((9.0/5.0) * c + 32);
	System.out.printf("%f celsius is %f Fahrenheit", c, f);
}
}