// 1, 2, 3, 4를 이용하여 세자리 자연수를 만드는 방법 (순서 O, 중복 X)

import java.util.Arrays;

public class Permutation {

    void swapPermutation(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            // 3. r 자리수가 만들어졌을 떄 
            for (int i = 0; i < r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        // 1. 반복문
        for (int i = depth; i < n; i++) {
            // 6. 자리를 바꿔준다.
            swap(arr, depth, i);
            // 2. 재귀
            swapPermutation(arr, depth + 1, n, r);
            // 7. 자리를 복구시킨다.
            swap(arr, depth, i);
        }
    }

    // 5. 자리수를 변경해주는 swap 함수
    void swap(int[] arr, int depth, int idx) {
        int temp = arr[depth];
        arr[depth] = arr[idx];
        arr[idx] = temp;
    }

    void visitedPermutation(int[] arr, int depth, int n, int r, boolean[] visited, int[] out) {

        if (depth == r) {
            System.out.println(Arrays.toString(out));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                visited[i] = true;
                out[depth] = arr[i];
                visitedPermutation(arr, depth + 1, n, r, visited, out);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = 4;
        int r = 3;
        boolean[] visited = new boolean[n];
        int[] out = new int[r];

        Permutation p = new Permutation();

        // swap을 이용한 순열
        p.swapPermutation(arr, 0, n, r);
        // visited 배열을 이용한 순열
        p.visitedPermutation(arr, 0, n, r, visited, out);

    }
}
