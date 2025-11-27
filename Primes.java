public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int q = Integer.parseInt(args[0]);
        boolean[] num = new boolean[q + 1];

        int i = 2;
        while (i <= q) {
            num [i]= true;
            i++;
        }
        int p = 2;
        while ( p * p <= q){
            if (num[p]){
                int krat = p * p;
                while ( krat <= q){
                    num[krat] = false;
                    krat = krat + p;
                }
            }
            p++;
        }
        System.out.println("Prime numbers up to " + q + ":");
        
        int count = 0;
        int k = 2;
        while (k <= q) {
            if (num[k]) {
                System.out.println(k);
                count++;
            }
            k++;
        }

            int c = (count * 100) / (num.length - 1);
            System.out.println("There are " + count + " primes between 2 and " + (q) + " ("  + c + "% are primes)");

    }
}