import java.util.ArrayList;

public class Validator {
  public static boolean cardLengthValidator(String cardNumber){
      return cardNumber.length() >= 13 && cardNumber.length() <= 16;
  }
public static CardType cardTypeValidator(String cardNumber) {
    if (String.valueOf(cardNumber.charAt(0)).equals("4")) {
        return CardType.VISA_CARD;
    } else if (String.valueOf(cardNumber.charAt(0)).equals("5")) {
        return CardType.MASTER_CARD;
    } else if ((String.valueOf(cardNumber.charAt(0)) + cardNumber.charAt(1)).equals("37")) {
        return CardType.AMERICAN_EXPRESS_CARD;
    } else if (String.valueOf(cardNumber.charAt(0)).equals("6")) {
        return CardType.DISCOVER_CARD;
    }
    return CardType.INVALID_CARD;
}
public static int oddCalculator(String cardNumber){
      int oddSum=0;
      var cardLength = cardNumber.length();
   for(int count= cardLength-1; count > 0; count-=2){
       oddSum+=Integer.parseInt(String.valueOf(cardNumber.charAt(count)));
   }
    return oddSum;
}
    public static int evenCalculator(String cardNumber){
        int evenSum=0;
        int doubleSum=0;
        var cardLength = cardNumber.length();
        for(int count= cardLength-2; count >= 0; count-=2){
            int i = Integer.parseInt(String.valueOf(cardNumber.charAt(count)));
            int multiple=  i *2;
            String multipleText = String.valueOf(multiple);

            if (String.valueOf(multiple).length()==2){

              evenSum+=  Integer.parseInt(String.valueOf(multipleText.charAt(0))) + Integer.parseInt(String.valueOf(multipleText.charAt(1)));
            }
            else
            {
                evenSum+=multiple;
            }
        }
        return evenSum;
    }
}



