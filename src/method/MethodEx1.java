package method;
//평균값 리펙토링
public class MethodEx1 {
    public static void main(String[] args) {
        System.out.println(average(1, 2, 3));
        System.out.println(average(15, 25, 35));
    }

    public static double average(int a, int b, int c){
        int sum = a+b+c;
        return sum / 3.0;
    }
}
