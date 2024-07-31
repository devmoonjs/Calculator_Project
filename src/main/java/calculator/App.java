package calculator;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit = "";

        CircleCalculator<Double> circleCalculator = new CircleCalculator<>();
        ArithmeticCalculator<Double> arithmeticCalculator = new ArithmeticCalculator<>();

        while(!exit.equals("exit")) {

//            IntroImage.introPrint(); // WELCOME
            IntroImage.calculatorPrint(); // 계산기 이미지 출력

            System.out.print("'사칙연산 = 0' OR '원의 넓이 구하기 = 1' 선택 하세요 : ");
            int choose = sc.nextInt();

            switch (choose) {
                case 0 : // 사칙연산 구현
                    System.out.print("첫 번째 숫자를 입력하세요 (숫자만 입력) : ");
                    arithmeticCalculator.setLeft(sc.nextDouble());

                    System.out.print("두 번째 숫자를 입력하세요 (숫자만 입력) : ");
                    arithmeticCalculator.setRight(sc.nextDouble());

                    System.out.print("사칙연산 기호를 입력하세요 (+ * / %) : ");
                    arithmeticCalculator.setSignal(sc.next().charAt(0));

                    // 계산 시작
                    try {
                        arithmeticCalculator.calculate();
                    } catch (DivideException e) {
                        System.out.println(e.getMessage());
                    }

                    // 가장 먼저 연산된 결과 삭제
                    System.out.print("저장된 연산 결과를 삭제하시겠습니까? (remove 입력 또는 clear 입력시 전체 삭제) ");
                    String arithDeleteAns = sc.next();
                    if (arithDeleteAns.equals("remove")) {
                        arithmeticCalculator.removeResult();
                    } else if (arithDeleteAns.equals("clear")) {
                        arithmeticCalculator.clearList();
                    }

                    // 향상된 for 문 활용 저장 결과 출력
                    System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) ");
                    if (sc.next().equals("inquiry")) {
                        arithmeticCalculator.inquiryResults();
                    }
                    break;

                case 1 : // 원의 너비 계산 구현
                    System.out.print("반지름을 입력하세요 (숫자만 입력) : ");
                    circleCalculator.setR(sc.nextDouble());
                    circleCalculator.calculate();

                    // 가장 먼저 연산된 결과 삭제
                    System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 또는 clear 입력시 전체 삭제) ");
                    String circleDeleteAns = sc.next();
                    if (circleDeleteAns.equals("remove")) {
                        circleCalculator.inquiryResults();
                    } else if (circleDeleteAns.equals("clear")) {
                        circleCalculator.clearList();
                    }

                    // 향상된 for 문 활용 저장 결과 출력
                    System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력시 조회) ");
                    if (sc.next().equals("inquiry")) {
                        circleCalculator.inquiryResults();
                    }
                    break;
            }
            // 추가 계산 여부
            System.out.print("더 계산하시겠습니까 ? (exit 입력 시 종료) ");
            exit = sc.next();
        }
    }
}
