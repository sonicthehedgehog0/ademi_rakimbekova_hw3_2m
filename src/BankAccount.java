public class BankAccount {
    private double amount;

    public int getAmount() {
        return (int)amount;
    }
   public void deposit(int sum){
        amount += sum;
       System.out.println("Вы положили на счет " + getAmount());
   }
   public void withDraw(int sum) throws LimitException {
       if (amount < sum){
           throw new LimitException("Ошибка. Запрашиваемая сумма на снятие больше чем остаток. " +
                   "\nСумма на снятие: " + sum + " Остаток: " + amount,amount);
       }
       amount -= sum;
       System.out.println("Вы сняли со счета " + sum);
   }
}
