public class Prime {
    public boolean isLazyPrime(int number){
        for (int i=1;i<number/2;i++){
            if (number%i!=0){
                return true;
            }
        }
        return false;
    }
    public boolean isOptimizedPrime(int number){
        for (int i=1;i<Math.sqrt(number);i++){
            if (number%i!=0){
                return true;
            }
        }
        return false;
    }
}
