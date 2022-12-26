public class CreditCard {
    private String cardNumber;
    private int oddSum;
    private int evenSum;
    private CardType cardType;
    private String validityStatus;


    public void setOddSum() {
        this.oddSum = Validator.oddCalculator(this.cardNumber);
    }
    public int getOddSum() {return oddSum;
    }


    public int getEvenSum() {
        return evenSum;
    }

    public void setEvenSum() {
        this.evenSum = Validator.evenCalculator(this.cardNumber);
    }



    public int getCardLength() {
        return cardLength;
    }

    public void setCardLength(String cardNumber) {
        this.cardLength = cardNumber.length();
    }

    private int cardLength;

    public CardType getCardType() {
        return cardType;
    }

    public String getValidityStatus() {
        return validityStatus;
    }

    public void setValidityStatus(String validityStatus) {
        this.validityStatus = validityStatus;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public CreditCard(String number) {
        this.cardNumber = number;
        this.cardLength = number.length();
        this.validityStatus = Validator.cardLengthValidator(number)? "Valid": "Invalid";
        if (Validator.cardLengthValidator(number))
        {
            this.cardType =   Validator.cardTypeValidator(number);
        }
    }
    public void setCardNumber(String number){

      this.cardNumber= number;
    }
    public String getCardNumber(){
        return cardNumber;
    }
}
