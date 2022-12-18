import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

    static void printHashSet() {
        // 자바에서 HashSet 사용
        // .add()
        // .remove(idx)
        // .size()g
        // .contains(n)

        HashSet a = new HashSet<>(Arrays.asList(1,2,3,4,5));
        HashSet b = new HashSet(Arrays.asList(2,4,6,8,10));

        System.out.println("교집합");
        a.retainAll(b);
        System.out.println("교집합: " + a); // 교집합: [2, 4]

        HashSet c = new HashSet<>(Arrays.asList(1,2,3,4,5));
        HashSet d = new HashSet(Arrays.asList(2,4,6,8,10));

        System.out.println("\n합집합");
        c.addAll(d);
        System.out.println("합집합: " + c); // 합집합: [1, 2, 3, 4, 5, 6, 8, 10]

        HashSet e = new HashSet<>(Arrays.asList(1,2,3,4,5));
        HashSet f = new HashSet(Arrays.asList(2,4,6,8,10));

        System.out.println("\n차집합");
        e.removeAll(f);
        System.out.println("차집합: " + e); // 차집합: [1, 3, 5]

        HashSet g = new HashSet<>(Arrays.asList(1,2,3,4,5));
        HashSet h = new HashSet(Arrays.asList(1,2));
        System.out.println(g.containsAll(h));
    }
    static void printMySet() {

        System.out.println();
        System.out.println("직접 구현한 집합으로 교집합, 합집합, 차집합 테스트");

        MySet a = new MySet(new int[]{1, 2, 3, 4, 5});
        MySet b = new MySet(new int[]{2, 4, 6, 8, 10});
        System.out.println("a: " + a.list);
        System.out.println("b: " + b.list);

        MySet result = a.retainAll(b);
        System.out.println("교집합: " + result.list);

        result = a.addAll(b);
        System.out.println("합집합: " + result.list);

        result = a.removeAll(b);
        System.out.println("차집합:" + result.list);
    }
    static void printNumberOfSet(){
        // 두개의 주사위를 던졌을 때 합이 3 또는 4의 배수일 경우의 수
        int[] A = {1, 2, 3, 4, 5, 6};
        int[] B = {1, 2, 3, 4, 5, 6};

        int nA = 0;
        int nB = 0;
        int nAandB = 0;

        // 기본 풀이
        for (int itemA: A) {
            for (int itemB: B) {
                if ((itemA + itemB) % 3 == 0) {
                    // 3의 배수
                    nA += 1;
                }
                if ((itemA + itemB) % 4 == 0) {
                    // 4의 배수
                    nB += 1;
                }
                if ((itemA + itemB) % 12 == 0) {
                    nAandB += 1;
                }
            }
        }
        System.out.println("결과: " + (nA + nB - nAandB));

        // HashSet 이용
        HashSet<ArrayList> allCases = new HashSet<>();
        for (int itemA : A) {
            for (int itemB: B) {
                if ((itemA + itemB) % 3 == 0 || (itemA + itemB) % 4 == 0) {
                    ArrayList list = new ArrayList(Arrays.asList(itemA, itemB));
                    allCases.add(list);
                }
            }
        }
        System.out.println("결과: " + allCases.size());

        // 곱의 법칙

        nA = 0;
        nB = 0;

        for (int itemA : A) {
            if (itemA % 3 == 0) {
                nA++;
            }
        }

        for (int itemB: B) {
            if (itemB % 4 == 0) {
                nB++;
            }
        }
        System.out.println("결과: " + (nA * nB));
    }

    public static void main(String[] args) {

        // 1_Set
//        printHashSet();
//        printMySet();

        // 2_Number Of Set
        printNumberOfSet();

    }
}