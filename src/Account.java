public class Account {

private int balance = 0;
private long accountNumber;
private String name;
private String accountType;
private int PIN;

    public void accountName(String name){
        this.name = name;
    }

    public String getAccountName(){
        return name;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public void isAccountType(String accountType){
        this.accountType =  accountType;
    }

    public String getAccountType(){
        return accountType;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public void verifyPIN(int pin){
        if(pin == PIN){
            this.PIN = pin;
        }
        else{
            throw new IllegalArgumentException("Incorrect-pin");
        }
    }

    public int getPIN(){
        return PIN;
    }

    public void createAccount(String name, int PIN, long accountNumber, String accountType){
        accountName(name);
        setPIN(PIN);
        setAccountNumber(accountNumber);
        isAccountType(accountType);
    }

    public void deposit(int amount){
        if(amount > 0){
            balance += amount;
        }
        else{
            throw new IllegalArgumentException("Invalid-deposit-amount");
        }
    }

    public void withdraw(int amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Invalid-withdrawal-amount");
        }

        if(amount > balance){
            throw new IllegalArgumentException("Insufficient-Balance");
        }

        balance -= amount;
    }

    public int getBalance(){
        return balance;
    }


}
