package codingbat_java.string2;

public class CatDog{
	
	public static void main(String[] args) {
		System.out.println(new CatDog().catdog("catghtyhdogdogcat"));
	}
	
	public boolean catdog( String  str ) {
		
		if(str.length() < 3)
			return false;
		
		int cat = 0, dog = 0;
		  
		  for(int i = 0; i <= str.length()-3; i++) {
		    
		    String substr = str.substring(i, i+3);
		    System.out.println(substr);
		    if (substr.equals("cat")) {
		      cat += 1;
		      i = i+2;
		    }
		    System.out.println(cat);	
		    if (substr.equals("dog")){
		      dog += 1;
		      i = i + 2;
		    }
		    
		    System.out.println(dog);
		    
		  }
		  System.out.println(cat);
		  System.out.println(dog);
		  
		  return cat == dog;
	}
}