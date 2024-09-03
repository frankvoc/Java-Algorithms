public class Hash {
    public int simpleHash(String key){
        System.out.println("The key is: " + key);
        int len = key.length();
        int sum = 0;
        for (int i = 0;i<len; i++){
            int decVal = key.charAt(i);
            sum = sum + decVal;
            System.out.println("Character " + (char)key.charAt(i) + " = " + decVal);
        }
        return sum;
    }

    public static void main(String[] args) {
       Hash hash = new Hash();
       int index = hash.simpleHash("John Doe");
       System.out.println("Index number generated from key: " + index); 
    }
}
