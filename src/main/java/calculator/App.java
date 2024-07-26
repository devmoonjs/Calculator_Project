package calculator;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit = "";
        List<Integer> list = new ArrayList<>();

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

            // list에 결과 저장
            System.out.println("결과 : " + result);
            list.add(result);

            // 가장 먼저 연산된 결과 삭제
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력)");
            if (sc.next().equals("remove")) list.remove(0);

            // 향상된 for 문 활용 저장 결과 출력
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if (sc.next().equals("inquiry")) {
                for (Integer temp : list) {
                    System.out.print(temp + " ");
                }
                System.out.println();
            }

            // 추가 계산 여부
            System.out.println("더 계산하시겠습니까 ? (exit 입력 시 종료)");
            exit = sc.next();
        }
    }
}
