public class Main
{
	public static void main(String[] args) {
	    
	    int step = 1;
	    int endLoop = 9;
		
		for (int i=1; i <=5; i++) {
		    for (int j=step; j <=endLoop; j++) {
		        if ( j % 2 != 0) {    
		            System.out.print(j);
		        } else if (j % 2 == 0) {
		            System.out.print("_");
		        }
		    } 
		    System.out.println("");
		    endLoop = endLoop - 1;
		    step = step + 1;
		} 
	}
}

/*

1_3_5_7_9
 _3_5_7_ 
3_5_7 
_5_ 
5 
*/