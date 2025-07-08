package method;

// 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것 = 메서드 오버로딩
// 메서드의 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩을 할 수 있다. (반환 타입 인정x)
public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1,2,3));
    }

    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a+b;
    }

    //첫번째 메서드와 이름은 같지만, 매개변수 목록이 다르다
    public static int add(int a, int b, int c){
        System.out.println("1번 호출");
        return a+b+c;
    }
}
