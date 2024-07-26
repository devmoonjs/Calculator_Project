package calculator;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요 : ");
        int firstNum = sc.nextInt();

        System.out.println("두 번째 숫자를 입력하세요 : ");
        int secondNum = sc.nextInt();

        System.out.println("사칙연산 기호를 입력하세요 : ");
        char signal = sc.next().charAt(0);
    }
}
