package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students;
        students = new int[3];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;

        for(int i = 0; i < students.length; i++){
            System.out.println("학생 " + (i+1) + "점수:" + students[i]);
        }
    }
}
