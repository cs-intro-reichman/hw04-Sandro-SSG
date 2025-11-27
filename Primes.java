public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int q = Integer.parseInt(args());
        boolean[] num = new boolean[q + 1];
        
        System.out.println("Prime numbers up to " + (num.length -1) +  ":");

        
        for(int i = 2; i < num.length; i++){
            num[i] = true;
            if(i % 2 == 0 && i != 2){
                num[i] = false;
            }else if(i % 3 == 0 && i != 3){
                num[i] = false;
            }else if(i % 5 == 0 && i != 5){
                num[i] = false;
            }
        }
        int a = 0;
        for(int u = 2; u < num.length; u++){
                if (num[u] == true){
                   System.out.println(u); 
                   a++;
                }
            }
            int c = (a * 100) / (num.length - 1);
            System.out.println("There are " + a + " primes between 2 and " + (num.length - 1) + " ("  + c + "% are primes)");

    }
}