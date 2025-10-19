public class Bank_Main{
    public static void main(String[] args) {
        Bank bank = new Bank(855786984, "Shivam", 54637.74, "PNB83636", "Kanpur");
        
        bank.credit(8855.97);
        bank.debit(7846.99);

        bank.credit(578);
        bank.debit(343);

        System.out.println("your balance is: " + bank.getBalance());
    }
}
