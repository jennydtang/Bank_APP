public class Savings extends Account {
    // List properties specific to the Savings account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // Constructor to initialize settings for the savings properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 3));
        System.out.println(safetyDepositBoxID);
    }

    // List any methods specific to savings account
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println("Your Savings Account Features" + "\nSafety Deposit Box ID: " + safetyDepositBoxID
                + "\nSafety Deposit Box Key: " + safetyDepositBoxKey);
    }
}