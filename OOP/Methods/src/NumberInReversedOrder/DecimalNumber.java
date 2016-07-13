package NumberInReversedOrder;


public class DecimalNumber {
String number;

    public DecimalNumber() {
        this.getNumber();
    }

    private String getNumber() {
        return number;
    }
    public String getReverseOrder(String number){
        StringBuilder sb = new StringBuilder();
        for (int i = number.length()-1; i >= 0; i--) {
            sb.append(number.charAt(i));
        }
        return sb.toString();
    }
}
