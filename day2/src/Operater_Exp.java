public class Operater_Exp{

	public static void main(String[] args){

		int x= Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);
		int z= Integer.parseInt(args[2]);
		 int big= (x>y) ?(x>z?x:z):(y>z?y:z);
		 System.out.println(big);
	}
}