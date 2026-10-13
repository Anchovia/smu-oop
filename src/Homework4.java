import java.util.Scanner;

class LoopGcd {
    int gcd(int m, int n) {
        while (n != 0) {
            if (m < n) {
                int remainder = n % m;
                n = remainder;
            } else {
                int remainder = m % n;
                m = n;
                n = remainder;
            }
        }

        return m;
    }
}

public class Homework4 {
    int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        if (m < n) {
            return gcd(m, n % m);
        } else {
            return gcd(n, m % n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 수를 입력하세요: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        Homework4 homework = new Homework4();
        int result = homework.gcd(m, n);

        System.out.println("두 수의 최대공약수는 " + result + "입니다.");
    }
}
