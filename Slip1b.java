class Slip1b
{
    String Depositor;
    int AccountNumber;
    enum AccountType {SAVINGS, CURRENT}
    AccountType AType;
    float Balance;
    void setAccount(int id, String name, float amount, AccountType atype)
    {
        Depositor =name;
        AccountNumber=id;
        AType=atype;
        Balance=amount;
    }
    void getBalance()
    {
        System.out.println("Depositor: "+Depositor);
        System.out.println("Account Number: "+AccountNumber);
        System.out.println("Account type: "+AType);
        System.out.println("Balance: "+Balance);
    }
    void deposit(float amt)
    {
        Balance+=amt;
    }
    boolean withdraw(float amt)
    {
        if(Balance-amt<500) return false;
        Balance-=amt;
        return true;
    }
    public static void main(String[] args) {
        Slip1b bank = new Slip1b();
        bank.setAccount(1, "Vikram", 1200, AccountType.SAVINGS);
        bank.deposit(800);
        bank.withdraw(100);
        bank.getBalance();
    }
}