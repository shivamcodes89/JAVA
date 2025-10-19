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

 class Bank{
    private int bankaccount;
    private String accountHolder;
    private double balance;
    private String IFSC;
    private String branch;


    public Bank(int bankaccount, String accountholder, double StartingBalance, String IFSC, String brance){
        this.bankaccount = bankaccount;
        this.accountHolder = accountholder;
        this.balance = StartingBalance;
        this.IFSC = IFSC;
        this.branch = brance;

    }
    
    
    public int getBankAccount(){
        return bankaccount;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public double getBalance(){
        return balance;
    }
    public String getIfsc(){
        return IFSC;
    }
    public String getBranch(){
        return branch;
    }


    public void credit(double amount){
        if(amount > 0){
            balance = amount + balance;
            System.out.println("credited: " + balance);
        }
        else{
            System.out.println("invalid amount");
        }

    }


    public void debit(double amount){
        if(amount > 0 && balance > amount){
            balance = balance - amount;
            System.out.println("debited: " + amount);
        }
        else{
            System.out.println("invalid");
        }
    }
}

