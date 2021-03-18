package gitjava2;

import java.util.HashMap;

public class convertCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s="abbbcccdddd";
	
HashMap<Character,Integer> hm= new HashMap<>();

char[]C=s.toCharArray();

for( int i=0;i<C.length; i++) {
	 int count=1;
for( int j=i+1;j<C.length; j++) {
	if(C[i]== C[j]) {
		
	count++;
	C[j]=' ';
	}
}

if(C[i]!=' ') {
	
	hm.put(C[i], count);
	
}	 
}
System.out.println(hm);
	}
}
	


