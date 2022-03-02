public class Main
{
	public static void main(String[] args) {
		
	    int A = 10;
	    int B = 2;
	    int C = 0;
	    
		do {
			
			if (A % B == 0) {
			    C = C + 2;
			} else {
			    C = C + 1;
			}     
			
			A = A - 1;
		} while (A >= 0);
		System.out.print("Untuk Jawaban Nomor 3: " + C);
	}
}

