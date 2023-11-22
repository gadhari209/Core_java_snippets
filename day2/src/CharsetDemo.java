//print A to Z using Ascii value 
public class CharsetDemo{

public static void main(String[] args){

	for(int i= 65;i<=90;i++){
		char ch=(char)(i);
		System.out.print(ch+" ");
	}

	for(int i= 97;i<=122;i++){
		char ch=(char)(i);
		System.out.print(ch+" ");
	}

	for(int i= 0;i<=127;i++){
		char ch=(char)(i);
		System.out.print(i+"->"+ch+" ");
	}
}

}