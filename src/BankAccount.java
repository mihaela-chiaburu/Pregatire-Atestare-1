public class BankAccount {
    private String numarAccount;
    private String proprietar;
    private double balance;
    private String bank;
    public BankAccount (String numarAccount, String proprietar, double balance, String bank){
        this.numarAccount = numarAccount;
        this.proprietar = proprietar;
        this.balance = balance;
        this.bank = bank;
    }
    public String getNumarAccount(){
        return this.numarAccount;
    }
    public String getProprietar(){
        return this.proprietar;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getBank(){
        return this.bank;
    }
    public void setBank(String bank) {
        this.bank=bank;
    }
    public void deposit(double amount){
        if(amount>0) {
            balance+=amount;
            System.out.println("Deposited " + amount);
        }
        else
            System.out.println("Invalid amount.");
    }
    public void extrage(double amount){
        if(amount>0 && amount<=balance) {
            balance-=amount;
            System.out.println("Extras " + amount);
        }
        else
            System.out.println("Invalid amount or insufficient balance.");
    }
    public String toString(){
        return "\n Numar Account: " + this.numarAccount + "\n Proprietar: " + this.proprietar
                + "\n Balance: " + this.balance + "\n" ;
    }

}
