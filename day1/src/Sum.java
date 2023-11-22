public class Sum{
	public static void main (String[] args){

		System.out.println(-10/0.0); // here you will not get Arithmatic Exception. you will get out put as -infinity
		System.out.println(10/0.0);//   here you will not get Arithmatic Exception. you will get out put as +infinity
		//System.out.println(10/0);// you will get  Arithmatic Exception
		System.out.println(0/0.0);
		double y = 10/0;
		int sum=0;
		for(int i=0;i<args.length;i++){
			sum= sum+Integer.parseInt(args[i]);	
		}
		System.out.println("sum is "+sum);



	}
}