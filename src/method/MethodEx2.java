package method;

//반복 출력 리펙토링
public class MethodEx2 {
    public static void main(String[] args) {
        printMessage("Hello world", 3);
        printMessage("Java", 5);
        printMessage("Springboot", 7);
    }

    public static void printMessage(String message, int times){
        for(int i=0; i<times; i++){
            System.out.println(message);
        }
    }
}
