public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Replace this comment with your code
        // "Our product will transform the market",
       for (int i = 0; i < sentences.length; i++){
            String newSentences = sentences[i];
            String sentenceLow = lowerCase(newSentences);
                for ( int o = 0; o < keywords.length; o++){
                    String newKeywords = keywords[o];
                    String keywordsLow = lowerCase(newKeywords);
                    if (contains(sentenceLow, keywordsLow) == true){
                        System.out.println(newSentences);
                    }
                   }
                }
            }
    
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

 