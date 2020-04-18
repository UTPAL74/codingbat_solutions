package codingbat_java.string2;

/*
 * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.


bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false

 * 
 */

public class BobThere {
	
	public boolean bobThere(String str) {
		  if(str.length() < 3)
		    return false;
		    
		  for(int i = 0; i < str.length()-2; i++){
		    int index = str.indexOf("b",i);
		    if(index < str.length()-2 && str.charAt(index+2) == 'b')
		      return true;
		  }
		  
		  return false;
		}


}
