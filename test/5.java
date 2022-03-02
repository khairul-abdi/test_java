public class Main
{
	public static void main(String[] args) {
		
	    int A = 10;
	    int B = 2;
	    int C = 0;
	    
	    int Iterasi = 0;
		do {
			
			if (A % B == 0) {
			    C = C + 2;
			} else {
			    C = C + 1;
			}     
			
			A = A - 1;
			
			Iterasi++;
			
			System.out.println("Iterasi " + Iterasi);
		    System.out.println("A => " + A);
		    System.out.println("B => " + B);
		    System.out.println("C => " + C);
		    System.out.println("----------------------");
		} while (A >= 0);
		
	}
}