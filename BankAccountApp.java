public class BankAccountApp {
    public static void main(String[] args) {
        Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500);

        Savings savacc1 = new Savings("Rich Lowe", "234567890", 2500);

        savacc1.showInfo();
        System.out.println("****************");
        chkacc1.showInfo();

    }
}