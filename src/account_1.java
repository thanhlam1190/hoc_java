import java.util.Scanner;

class account_1 {
    Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private int balance = 0;
    public account_1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public account_1(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = sc.next();
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }

    public void display() {
        System.out.println("Tên tài khoản: "+ getName());
        System.out.println("ID: "+ getId());
        System.out.println("Số tiền : " + balance);
    }

    public static void main(String[] args) {
        account_1 tai_khoan_1 = new account_1(350, "Lam");
        // tai_khoan_1.setName("");
        tai_khoan_1.deposit(24000);
        tai_khoan_1.withdraw(4000);
        tai_khoan_1.display();
    }
}