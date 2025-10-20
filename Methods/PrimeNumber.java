public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(isPrime(763));
        System.out.println(isPrime(4));
        
    }


    public static boolean isPrime(int x){
        int res = 0;
    for(int i=1; i < x / 2; i++){
        if(x % i == 0){
            res++;
        }
    }
    return res == 1;
    }
}
