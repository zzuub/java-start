package cond.ex;

public class ScoreEx3 {
    public static void main(String[] args) {
        int dollar = 11;
        // int exchange = 1300;    //dollar>0 조건에서만 필요한거니까 그 조건안에 넣기

        if(dollar < 0) {
            System.out.println("잘못된 금액입니다");
        } else if(dollar == 0){
            System.out.println("환전할 금액이 없습니다");
        } else {
            //exchange = exchange * dollar;
            int exchange = dollar * 1300;
            System.out.println("환전 금액은 " + exchange + "원 입니다.");
        }
    }
}
