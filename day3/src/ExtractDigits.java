public class ExtractDigits{
	public static void main(String[] args){
		int digit1 =1+(int)(Math.random()*500);
		int digit=digit1;
		System.out.println(digit);
		int rev=0;
		while(digit>0){
			int temp =digit%10;
			rev=rev*10+temp;
			digit=digit/10;
		}	

		System.out.println(rev);
		if(rev==digit1){
			System.out.println(digit1+"is palandrom");
		}else System.out.println(digit1+" is not palandrom");
	}
}