package gitjava2;

public class reverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseSentence obj= new  reverseSentence();
		System.out.println(obj.sentenceReverse("selinium is automation tool"));
		
	}	
	public String sentenceReverse(String s) {	
		String rev="";
		
		
		for( int i=s.length()-1;i>=0;i-- ) {
			rev= rev+s.charAt(i);
		}	
			return rev;
			
		

		

	}

}
