public class StaticFactoryExp{

	private StaticFactoryExp(){
		System.out.println("inside the private constarctor  ");
	}

	public static StaticFactoryExp createInstance(){
		System.out.println("exmaple of Static factory is giving instance of class ");
		return new StaticFactoryExp();
	}

	public static void main(String[] args) {
		StaticFactoryExp sfe =StaticFactoryExp.createInstance();
		System.out.println(sfe);
	}

}