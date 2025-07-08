package method;

//입출금 리펙토링
public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);

        System.out.println("최종잔액: " + balance + "원");
   }

    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액:" + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount){
        if(balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액 부족");
        }
        return balance;
    }
}
