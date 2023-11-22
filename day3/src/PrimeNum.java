public class PrimeNum{
	public static void main(String[] args){
		int num=1+(int)(Math.random()*100);
		int count=0;
		int i;

			for(i =2;i<(num/2);i++){
				if(num%i==0){
					count++;
					break;
				}
			}
			if(count==0){
					System.out.println(num+" num is prime number ");
				}
				else{System.out.println(num+"number is n0t prime");}
				System.out.println(i+" times  loop  is run");
	}
}