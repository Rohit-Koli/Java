import java.io.InputStreamReader; 
import java.io.BufferedReader; 
import java.io.IOException; 
class perfectNum 
{ 
	public static void main(String[] args)throws IOException 
	{ 
		InputStreamReader isr = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(isr); 
		System.out.print("Enter a number : "); 
		long n,sq; 
		n = Integer.parseInt(br.readLine()); 
		sq = n * n; 
		if ((sq - n) % 10 == 0) 
			System.out.printf("%d is an Perfect number.\n" , n); 
		else 
			System.out.printf("%d is not an Perrfect number.\n" , n); 
	} 
} 