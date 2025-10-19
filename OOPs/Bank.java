public class Bank{
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
