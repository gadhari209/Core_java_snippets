import java.util.*;
public class GuessNum{

	

	public static void main(String[] args){
		 int num;
	int guess;
 int count=0;
		Scanner sc = new Scanner(System.in);
		num = 1+(int)(Math.random()*10);

		System.out.println("Guess a number betweeen 1 to 10");
		
		while(count==0){
			guess=sc.nextInt();
		if(num==guess){
			System.out.println("you won a game");
			count=1;
		}
		else if(num<guess){
			System.out.println("your gess is to high ,guess again");
		}
		else if(num>guess){
			System.out.println("your guess is to low , guess again");
		}

}

	}
}