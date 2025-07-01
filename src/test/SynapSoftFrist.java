package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SynapSoftFrist {
        public static String numToCol(int number){
            StringBuilder colName = new StringBuilder();

            while (number > 0){
                number--;
                colName.insert(0, (char) ('A' + (number % 26)));
                number /= 26;
            }
            return colName.toString();
        }

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line ;

            while ((line = br.readLine()) != null && !line.isEmpty()) {
                try{
                    int number = Integer.parseInt(line.trim());

                    if (number > 0) {
                        System.out.println(numToCol(number));
                    } else {
                        System.out.println("1 이상의 숫자 입력.");
                    }

                } catch (NumberFormatException e){
                    System.out.println("숫자만 입력.");
                }
            }
        }
    }

