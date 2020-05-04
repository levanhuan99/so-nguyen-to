public class OptimizedPrimeFactorization extends Thread {
    @Override
    public void run() {
        Prime prime=new Prime();
        for (int i=1;i<10;i++){
            if (prime.isOptimizedPrime(i)){
                System.out.println("optimized prime "+i);
            }
        }
    }
}
