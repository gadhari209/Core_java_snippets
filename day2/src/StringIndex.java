import java.util.*;
public class StringIndex{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str= "A1B2C3D4E5F6G7H8I9J10K11L12M13N14O15P16Q17R18S19T20U21V22W23X24Y25Z26";
		System.out.println("enter one capital latter between A to Z ");
		int position = str.indexOf(sc.next());
		System.out.println(position);
		String result =str.substring(position+1);
		System.out.println(result);
		char[] ch= str.toCharArray();
		System.out.println(ch[2]);
	}
}