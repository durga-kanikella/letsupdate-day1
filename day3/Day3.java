import java.util.Scanner;
class Cab{
	int fare=50;
	int amount;
	public Cab(int cd) {
		if(cd>5){
			amount=10*(cd);
			amount+=fare+10*(cd-5);
	}
		else {
			amount=10*cd;
	}
		System.out.println("The total amount to be paid is: "+amount);
	}
	
}


public class Day3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cd;
		System.out.println("Enter the distance of cab from user:");
		cd=sc.nextInt();
		Cab ob=new Cab(cd);
		
	}

}
