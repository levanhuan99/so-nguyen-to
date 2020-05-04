public class LazyPrimeFactorization implements Runnable {


    @Override
    public void run() {
        Prime prime=new Prime();
        for (int i=1;i<10;i++){
            if (prime.isLazyPrime(i)){
                System.out.println("lazy prime "+i);
            }
        }
    }
}
