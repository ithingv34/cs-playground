// 약수 구하기, 최대공약수와 최소 공배수 구하기
// 1~10의 수 중 A의 약수 또는 B의 약수인 경우의 수
// 1~10의 수 중 A의 약수이면서 B의 약수인 경우의 수

import java.util.ArrayList;

public class NumberOfCases {

    // 약수
    public ArrayList getDivisor(int num) {
        ArrayList result = new ArrayList();

        for (int i = 1; i <= (int)num / 2; i++) {
            if (num % i == 0) {
                result.add(i);
            }
        }
        result.add(num);
        return result;
    }

    // 최대 공약수
    public int getGCD(int numA, int numB) {
        int gcd = -1;

        // 두 숫자들의 약수를 구해준다.
        ArrayList divisorA = this.getDivisor(numA);
        ArrayList divisorB = this.getDivisor(numB);

        // 최대 공약수를 뽑아준다.
        for (int itemA: (ArrayList<Integer>) divisorA) {
            for (int itemB: (ArrayList<Integer>) divisorB) {
                if (itemA == itemB) {
                    if (itemA > gcd) {
                        gcd = itemA;
                    }
                }
            }
        }

        return gcd;
    };

    // 최소 공배수
    // 최소 공배수 = numA * numB / GCD
    public int getLCM(int numA, int numB){
        int lcm = -1;
        int gcd = this.getGCD(numA, numB);

        if (gcd != -1) {
            lcm = numA * numB / gcd;
        }
        return lcm;
    }

    public static void main(String[] args) {
        // Test Code
        int number1 = 10;
        int number2 = 6;

        NumberOfCases n = new NumberOfCases();
        ArrayList l1 = n.getDivisor(number1);
        ArrayList l2 = n.getDivisor(number2);

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        System.out.println("최대 공약수: " + n.getGCD(number1, number2));
        System.out.println("최소 공배수: " + n.getLCM(number1, number2));
    }
}
