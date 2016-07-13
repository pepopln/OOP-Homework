package LastDigitName;


public class Number {
int number;

    public Number() {
        this.getNumber();
    }

    private int getNumber() {
        return number;
    }
    public String nameLastDigit(int number){
        int lastdigit=number%10;

        switch (lastdigit){
            case 0:
                return "zero";

            case 1:
                return "one";

            case 2:
                return "two";

            case 3:
                return "three";

            case 4:
                return "four";

            case 5:
                return "five";

            case 6:
                return "six";

            case 7:
                return "seven";

            case 8:
                return "eight";

            case 9:
                return "nine";
            default:
                return null;
        }

    }


}
