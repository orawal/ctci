package arraysAndStrings;

//Implement an algorithm to determine if a string has all unique characters. What
//if you cannot use additional data structures?

public class UniqueChar {
	
	public static boolean isUniqueChar(String str) {
		if(str.length() > 256 || str == null) return false;
		
		boolean char_set[]=new boolean[256]; 
		for(int i=0; i<str.length(); i++) {
			int val=str.charAt(i);
			if(char_set[val])
				return false;
			else char_set[val]=true;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("abc " + isUniqueChar("abc"));
		System.out.println("abbc "+ isUniqueChar("abbc"));
	}

}
