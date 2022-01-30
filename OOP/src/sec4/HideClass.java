package sec4;

public class HideClass {
    private int balance;
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}

class Test1{
    public static void main(String[] args) {
        HideClass hc = new HideClass();

        System.out.println(hc.getBalance());
        hc.setBalance(10);
        System.out.println(hc.getBalance());
    }
}
