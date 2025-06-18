package array;

public class EnhanceFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        //일반 for문
        for(int i = 0; i< numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }

        //향상된 for문, for-each문
        //단축키 : iter
        //종료 조건x, 해당 배열 처음부터 끝까지 탐색색
       for(int number : numbers) {
            System.out.println(number);
        }

       //for-each문 사용할 수 없는 경우 -> 증가하는 index값이 필요한 경우
        //int i와 같은 증가하는 인덱스 값을 직접 사용해야 하는 경우
        for (int i = 0; i < numbers.length; ++i) {
            System.out.println("number" + i + "번의 결과는:" + numbers[i]);
        }

    }
}
