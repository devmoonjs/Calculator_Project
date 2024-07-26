package calculator;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit = "";
        List<Integer> list = new ArrayList<>();

        Calculator calculator = new Calculator();

        while(!exit.equals("exit")) {
            System.out.println("첫 번째 숫자를 입력하세요 : ");
            int firstNum = sc.nextInt();

            System.out.println("두 번째 숫자를 입력하세요 : ");
            int secondNum = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요 : ");
            char signal = sc.next().charAt(0);

            // 연산은 Calculator 에서 구현
            try {
                calculator.calculate(firstNum, secondNum, signal);
            } catch (DivideException e) {
                System.out.println(e.getMessage());
            }


            // 가장 먼저 연산된 결과 삭제
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력)");
            if (sc.next().equals("remove")) {
                calculator.removeResult();
            }

            // 향상된 for 문 활용 저장 결과 출력
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if (sc.next().equals("inquiry")) {
                calculator.inquiryResults();
            }

            // 추가 계산 여부
            System.out.println("더 계산하시겠습니까 ? (exit 입력 시 종료)");
            exit = sc.next();
        }
    }
}
