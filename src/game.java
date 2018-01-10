import java.util.Arrays;
import java.util.Scanner;

public class game {
	public static int [][] Sea = 	{
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 3, 3, 3, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
										{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
										};
	public static void main (String [] args) {
	//	int [] Sea = {1, 0, 0, 0, 3, 3, 3, 0, 0, 0};
	//veld van 10 plekken met een schip van lengte 3
		System.out.println(Arrays.toString(Sea));
		//print het veld met schip
		 
	Scanner sc = new Scanner(System.in);
	for (int j = 0; j < 10; j++) {
	int i = sc.nextInt();
		checkIfShipHit(i);}
	
	}
	
	public static void checkIfShipHit(int i2) {
		if (Sea[i2] == 0) 
			{System.out.println("missed");}
		else 
			{System.out.println("hit");}
	}
}