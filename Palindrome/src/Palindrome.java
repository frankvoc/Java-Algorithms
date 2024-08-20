package Palindrome.src;
//Not the Destiny handcannon
public class Palindrome {
    public static boolean isPalindrome(int i, int j, String str) {
		if (i>=j) {
			return true;
		}
		if(str.charAt(i) != str.charAt(j)) {
			return false;
		}
		return isPalindrome(i+1,j-1,str);
	}
	public static boolean isPalindrome(String str) {
		String sentence = str.toLowerCase().replaceAll("[^a-z]", "");
		return isPalindrome(0, sentence.length()-1,sentence);
	}
	
	 public static void main(String[] args)
	    {
	        String str = "Doc, note I dissent. A fast never prevents a fatness. I diet on cod";
	        boolean out = isPalindrome(str);
	        System.out.println("\"" + str + "\" is a palindrome: " + out);
	    }
	
	
}


