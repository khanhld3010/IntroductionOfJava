package changeMoney;

import java.util.Scanner;

public class ChangeMoney {
    static final double RATE = 23000;
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số USD cần quy đổi");
        double numberUsd = scanner.nextInt();
        double numberVnd = numberUsd * RATE;
        System.out.printf("%.2f USD đổi sang VND là %.2f",numberUsd,numberVnd);
    }
}
