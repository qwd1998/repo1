package day06_code.demo04Supplier;

import java.util.function.Supplier;

/*
使用Supplier来求数组中的最大值
 */
public class Demo02Test {
    public static void main(String[] args) {
        int a[] = {1, 5, 8, 12, 48, 59};
        int maxz=getMax(() -> {
            int max = a[0];
            for (int i = 1; i < a.length; i++) {
                if (max < a[i]) {
                    max = a[i];
                }
            }
            return max;
        });
        System.out.println(maxz);

    }

    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}
