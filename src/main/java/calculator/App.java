package calculator;
import java.util.*;

public class App {

    static int resultSize = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit = "";
        int[] resultArr = new int[resultSize];
        int submitCount = 0;

        while(!exit.equals("exit")) {
            System.out.println("첫 번째 숫자를 입력하세요 : ");
            int firstNum = sc.nextInt();

            System.out.println("두 번째 숫자를 입력하세요 : ");
            int secondNum = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요 : ");
            char signal = sc.next().charAt(0);

            int result = 0; // 사칙연산 결과 값 저장 변수
            switch (signal) {
                case '+' :
                    result = firstNum + secondNum;
                    break;

                case '-' :
                    result = firstNum - secondNum;
                    break;

                case '*' :
                    result = firstNum * secondNum;
                    break;

                case '/' :
                    if (secondNum != 0) result = firstNum / secondNum;
                    else System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
            }
            if (submitCount >= 10) { // 결과 저장 배열이 10개를 초과할 경우
                for (int i = resultArr.length - 1; i > 0; i--) { // 뒤에서 부터 하나씩 제거하며 이동
                    resultArr[i] = resultArr[i-1];
                }
                resultArr[0] = result;
             } else resultArr[submitCount++] = result; // 결과 저장

            System.out.println("결과 : " + result);

            System.out.println("더 계산하시겠습니까 ? (exit 입력 시 종료)");
            exit = sc.next();
        }
    }
}
