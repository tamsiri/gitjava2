package gitjava2;



public class reverseAString {

	public  String reverse(String str) {
		// TODO Auto-generated method stub
		

String rev="";
int len=str.length();
for( int i=str.length()-1; i>=0;i--){
	rev=rev+str.charAt(i);
	
}
return rev;
	
}
public  static void  main(String[]args) {
	
	
	reverseAString obj= new reverseAString();
System.out.println(obj.reverse("selenium "));

	
}
}

