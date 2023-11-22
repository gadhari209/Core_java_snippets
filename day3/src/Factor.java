public class Factor{
	public static void main(String[] args){
		//int num = 1+(int)(Math.random()*100);
		int num=6;
		System.out.println(num);
		int count=0;
		int sum=0;
		

			for(int i=1; i<=num; i++){
				if(num%i==0) {
					System.out.println(i);
					count++;
					sum+=i;

				}
			}
			System.out.println("Number of Factor is"+count);
			if(count==2){
				System.out.println(num+"is prime num = ");
			}
			int perfect=sum-num;
			System.out.println(sum+"sum of Factor");
			if(num == perfect){
				System.out.println(num +"is perfect num");
			}
	}
}