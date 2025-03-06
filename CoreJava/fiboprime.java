public class fiboprime {
    public static void main(String args[]) {
        int arr[] = new int[10];
        int term1 = 1, term2 = 1, term3;
        arr[0] = term1;
        arr[1] = term2;
        
        System.out.print(term1 + " " + term2);
        
        for (int i = 2; i < 10; i++) {
            term3 = term1 + term2;
            arr[i] = term3;
            System.out.print(" " + term3);
            
            term1 = term2;
            term2 = term3;
        }
        
        System.out.println("\nStored in array:");
        for (int i = 0; i < 10; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        System.out.println("\nPrime Numbers in Fibonacci Series:");
        for (int i = 0; i < 10; i++) {
            if (isPrime(arr[i])) {
                System.out.println(arr[i] + " is a prime number.");
            }
        }
    }


    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) { // Loop up to sqrt(n) for efficiency
            if (n % i == 0) return false;
        }
        return true;
    }
}
