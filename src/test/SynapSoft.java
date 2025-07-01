package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SynapSoft {

    public static void main(String[] args) {
        ColNametrans trans = new ColNametrans();
        SynapSoft synap = new SynapSoft(trans);
        synap.run();
    }

    private final ColNametrans trans;

    public SynapSoft(ColNametrans trans) {
        this.trans = trans;
    }

    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;

            while ((line = br.readLine()) != null && !line.isEmpty()) {
                try {
                    int number = Integer.parseInt(line.trim());
                    if (number > 0) {
                        String column = trans.convert(number);
                        System.out.println(column);
                    } else {
                        System.out.println("1 이상의 숫자만 입력하세요.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("숫자만 입력하세요.");
                }
            }

        } catch (IOException e) {
            System.err.println("입력 오류: " + e.getMessage());
        }
    }

    private static class ColNametrans {
        public String convert(int number) {
            StringBuilder colName = new StringBuilder();

            while (number > 0) {
                number--;
                colName.insert(0, (char) ('A' + (number % 26)));
                number /= 26;
            }
            return colName.toString();
        }
    }
}
