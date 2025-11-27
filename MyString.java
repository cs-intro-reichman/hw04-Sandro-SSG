public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    //System.out.println("UnHappy : " + lowerCase("UnHappy"));
    public static String lowerCase(String str) {
        String res = "";
        for ( int i = 0; i < str.length(); i++){
            if ( (int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90 ){
                int a = str.charAt(i) + 32;
                char b = (char)a;
                res = res + b;
            }else{
            res = res + str.charAt(i);
            }
        }
        // Replace the following statement with your code
        return res;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        // System.out.println(contains("resignation", "sign"))
        if (str1.length() < str2.length()){
            return false;
        }
        for (int i = 0 ; i < (str1.length() - str2.length()); i++){
            boolean match = true;
            for ( int u = 0; u < str2.length(); u++){
                char b = str2.charAt(u);
                if( str1.charAt(i + u) != b){
                    match = false;
                    break;
                }
            }
            if ( match == true){
                return true;
            }
        }
        return false;
    }
}
