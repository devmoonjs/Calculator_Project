package calculator;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit = "";

        CircleCalculator circleCalculator = new CircleCalculator();
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

        while(!exit.equals("exit")) {

            System.out.println("'사칙연산' OR '원의 넓이 구하기' 선택 하세요 : (0 OR 1)");
            int choose = sc.nextInt();

            switch (choose) {
                case 0 : // 사칙연산 구현
                    System.out.println("첫 번째 숫자를 입력하세요 : ");
                    arithmeticCalculator.setLeft(sc.nextDouble());

                    System.out.println("두 번째 숫자를 입력하세요 : ");
                    arithmeticCalculator.setRight(sc.nextDouble());

                    System.out.println("사칙연산 기호를 입력하세요 : ");
                    arithmeticCalculator.setSignal(sc.next().charAt(0));

                    // 계산 시작
                    try {
                        arithmeticCalculator.calculate();
                    } catch (DivideException e) {
                        System.out.println(e.getMessage());
                    }

                    // 가장 먼저 연산된 결과 삭제
                    System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력)");
                    if (sc.next().equals("remove")) {
                        arithmeticCalculator.removeResult();
                    }

                    // 향상된 for 문 활용 저장 결과 출력
                    System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                    if (sc.next().equals("inquiry")) {
                        arithmeticCalculator.inquiryResults();
                    }
                    break;

                case 1 : // 원의 너비 계산 구현
                    System.out.println("반지름을 입력하세요 : ");
                    circleCalculator.setR(sc.nextInt());
                    circleCalculator.calculate();

                    // 가장 먼저 연산된 결과 삭제
                    System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력)");
                    if (sc.next().equals("remove")) {
                        circleCalculator.inquiryResults();
                    }

                    // 향상된 for 문 활용 저장 결과 출력
                    System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력시 조회)");
                    if (sc.next().equals("inquiry")) {
                        circleCalculator.inquiryResults();
                    }
                    break;
            }
            // 추가 계산 여부
            System.out.println("더 계산하시겠습니까 ? (exit 입력 시 종료)");
            exit = sc.next();
        }
    }
}
