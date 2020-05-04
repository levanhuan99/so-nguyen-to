public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lpf=new LazyPrimeFactorization();
        OptimizedPrimeFactorization opf=new OptimizedPrimeFactorization();

        Thread thread1=new Thread(lpf);
        Thread thread2=new Thread(opf);

        thread1.start();
        thread2.start();
    }
}
