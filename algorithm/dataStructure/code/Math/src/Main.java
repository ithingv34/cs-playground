import java.util.Arrays;
import java.util.HashSet;

public class Main {

    static void printHashSet() {
        // 자바에서 HashSet 사용
        // .add()
        // .remove(idx)
        // .size()
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

    public static void main(String[] args) {

        printHashSet();
        printMySet();
    }
}