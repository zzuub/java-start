package array;

//배열을 사용하도록 변경
public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int total = 0;

        /*for(int i=0; i < students.length; i++){
            total += students[i];
        }*/
        for (int student : students) {
            total += student;
        }

        double average = (double) total / students.length;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
