import java.util.Scanner;
import java.io.FilterInputStream;


public class J22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner r1 = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {
		}
		});
		
		
		double x =0;
		System.out.println("Podaj długośc boku sześciokąta: ");
		x = r1.nextDouble();
		System.out.println("Pole sześciokąta foremnego to: " + 3*Math.pow(x,2)*Math.sqrt(3)/2);
		r1.close();
	}
}