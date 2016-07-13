package PrimeChecker;


public class Number {
private int number;
 private boolean prime;

    public void setPrime(boolean prime) {
        this.prime = prime;
    }

    public Number(int number) {
        this.number = number;
        this.prime = true;

    }

    public int getNumber() {
        return number;
    }

    public boolean isPrime() {
        return prime;
    }


    public Number findNextPrime() {
        if (this.number==0||this.number==1){
            return new Number(this.number+1);
        }

        for (int i = this.number+1; i <2*this.number; i++) {
            boolean result =checkIsPrime(i);
            if (result){
                return new Number(i);
            }
        }
        return new Number(0);
    }

    public boolean checkIsPrime(int number) {
        if (number==0||number==1){
            return true;
        }
        double maxDivider = Math.sqrt(number);
        for (int i = 2; i <= maxDivider; i++) {
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
