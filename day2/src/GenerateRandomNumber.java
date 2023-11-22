public class GenerateRandomNumber{
	public static void main (String[] args){
		System.out.println(Math.random());
		int x = (int)(Math.random()*10);//it will generate random number between 0 to 9
		int y=(int)(1+Math.random()*10);// it will generate random number between 1 to 10
		System.out.println(x);
		System.out.println(y); 
	}
}