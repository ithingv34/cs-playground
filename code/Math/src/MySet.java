import java.util.ArrayList;

public class MySet {

    ArrayList<Integer> list;

    // 생성자1
    MySet() {
        this.list = new ArrayList<Integer>();
    }

    MySet(int[]  arr) {
        this.list = new ArrayList<Integer>();

        for (int item: arr) {
            this.list.add(item);
        }
    }

    // 원소를 추가하는 함수 (중복 제거)
    public void add(int x) {
        for (int item: this.list) {
            if (item == x) {
                return;
            }
        }
        this.list.add(x);
    }

    // 교집합
    public MySet retainAll(MySet b) {
        MySet result = new MySet();

        for (int itemA : this.list) {
            for (int itemB : b.list) {
                if (itemA == itemB) {
                    result.add(itemA);
                }
            }
        }
        return result;
    }

    // 합집합
    public MySet addAll(MySet b) {
        MySet result = new MySet();

        for (int itemA : this.list) {
            result.add(itemA);
        }
        for (int itemB : b.list) {
            result.add(itemB);
        }
        return result;
    }

    // 차집합
    public MySet removeAll(MySet b) {
        MySet result = new MySet();

        for (int itemA : this.list) {
            boolean containFlag = false;
            for (int itemB : b.list) {
                if (itemA == itemB) {
                    containFlag = true;
                    break;
                }
            }
            if (!containFlag) {
                result.add(itemA);
            }
        }
        return result;
    }
}
