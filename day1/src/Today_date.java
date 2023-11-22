public class Today_date{
	int x;

	{
		x=12;

	}
	public static void main(String[] args){

		java.util.Date today=new java.util.Date();
		System.out.println(today);
		Today_date t1 = new Today_date();
		System.out.println(t1.x);
	
		System.out.println(	t1.toString());
		System.out.println("hashcode "+t1.hashCode());
		System.out.println("getclass "+t1.getClass());

	}

}