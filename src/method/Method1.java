package method;

public class Method1 {
    public static void main(String[] args) {
        //계산1
        //호출할때 넘기는 값 (a, b) ->인수(Argument, 인자) = 메서드 내부로 들어가는 값
        int sum1 = add(5, 10);
        System.out.println("결과1 출력:" + sum1);

        //계산2
        int sum2 = add(10, 15);
        System.out.println("결과2 출력:" + sum2);
    }

    //add 메서드
    //(int a, int b) -> 매개변수(parameter) = 메서드 정의할때 변수
    public static int add(int a, int b){
        System.out.println(a + "+" + b + "연산 수행");
        int sum = a + b;
        return sum;
    }
}
