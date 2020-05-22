public class Checking extends Account {
    // List properties specific to a Checking Account
    int debitCardNumber;
    int debitCardPIN;

    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit); // call a super since you will call it in account as well
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    // List any methods specific to the checking account
    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 3));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
        // System.out.println("CARD: " + this.debitCardNumber);
        // System.out.println("PIN: " + this.debitCardPIN);

    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account Features" + "\n Debit Card Number: " + debitCardNumber
                + "\nDebit Card PIN" + debitCardPIN);
    }
}