package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students;         //배열 변수 선언
        students = new int[3];  //배열 생성

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;

        System.out.println("학생1 점수:"+students[0]);
        System.out.println("학생1 점수:"+students[1]);
        System.out.println("학생1 점수:"+students[2]);
    }
}

