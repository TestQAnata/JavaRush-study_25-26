package Les_7;

import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {
        int[] pod1 = new int[] {10, 15, 17, 14, 22};
        int[] pod2 = new int[] {10, 12, 20, 9, 19};
        int[] pod3 = new int[] {10, 12, 20, 9, 19};

//        System.out.println(Arrays.toString(pod1));

        int [] [] sadovaya_10 = new int[3][];

        sadovaya_10[0] = pod1;
        sadovaya_10[1] = pod2;
        sadovaya_10[2] = pod3;

//        System.out.println(Arrays.deepToString(sadovaya_10));
        for (int i = 0; i < sadovaya_10.length; i++) {
            for (int j = 0; j < sadovaya_10[i].length; j++) {
                System.out.print(sadovaya_10[i][j] + " ");

            }
            System.out.println();

        }

    }

}
