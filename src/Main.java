public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(15000);
        while (true){
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());
                    break;
                } catch (LimitException ex) {
                    e.getRemainingAmount();
                    System.out.println("Остаток снят со счета.");
                }
            }
        }

    }
}