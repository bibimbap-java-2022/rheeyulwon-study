import java.util.Scanner;

public class Main {

    // Scanner 선언 및 생성

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // 자신의 이름 출력
        System.out.println("이율원");
        // 자신의 학번 출력
        System.out.println("202211342");

        // A와 B를 받아 A@B 연산 결과를 출력하는 프로그램 작성
        // A@B = (A+B)*(A-B)
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();

        System.out.println((a1 + b1) * (a1 - b1));

        // (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
        // (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
        // 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성.
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int c2 = scanner.nextInt();

        if (((a2 + b2) % c2) == (((a2 % c2) + (b2 % c2)) % c2))
            System.out.println("(A+B)%C는 ((A%C) + (B%C))%C 와 같다");
        else
            System.out.println("(A+B)%C는 ((A%C) + (B%C))%C 와 다르다");

        if (((a2 * b2) % c2) == (((a2 % c2) * (b2 % c2)) % c2))
            System.out.println("(A×B)%C는 ((A%C) × (B%C))%C 와 같다");
        else
            System.out.println("(A×B)%C는 ((A%C) × (B%C))%C 와 다르다");
    }
}