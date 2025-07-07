package method;

//각각의 메서드 안에서 사용하는 변수는 이름이 같아도 서로 완전히 분리된 다른 변수
public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1:" + num1);
        changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1:" + num1);
    }

    public static int changeNumber(int num2){
        num2 = num2*2;
        return num2;
    }
}
