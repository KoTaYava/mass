public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int[] weid = new int[3];
        weid[0] = 1;
        weid[1] = 2;
        weid[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(weid[i]);

        }
        double[] weight = {1.57, 7.654, 9.986};
        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);
        }
        int[] wei = {12, 13, 15, 16, 23, 34, 35, 87, 65, 99, 123};
        for (int i = 0; i < wei.length; i++) {
            System.out.println(wei[i]);
        }
        System.out.println("Длина массива: " + wei.length);

        System.out.println("Задача 2");

        int[] weidNew = new int[3];
        weidNew[0] = 1;
        weidNew[1] = 2;
        weidNew[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.print(weidNew[i]);
            if (i != 2) {
                System.out.print(",");

            }

        }
        System.out.println();
        double[] weightNew = {1.57, 7.654, 9.986};
        for (int i = 0; i < weightNew.length; i++) {
            System.out.print(weightNew[i]);
            if (i != 2) {
                System.out.print(",");
            }


        }
        System.out.println();
        int[] weiq = {12, 13, 15, 16, 23, 34, 35, 87, 65, 99, 123};
        for (int i = 0; i < weiq.length; i++) {
            System.out.print(weiq[i]);
            if (i != 10) {
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.println("Задача 3");

        int[] weidw = new int[3];
        weidw[0] = 1;
        weidw[1] = 2;
        weidw[2] = 3;
        for (int i = weidw.length - 1; i >= 0; i--) {
            System.out.print(weidNew[i]);
            if (i != 0) {
                System.out.print(",");

            }
        }

        System.out.println();
        System.out.println();
        double[] weightW = {1.57, 7.654, 9.986};
        for (int i = weightW.length - 1; i >= 0; i--) {
            System.out.print(weightW[i]);
            if (i != 0) {
                System.out.print(",");
            }

        }
        System.out.println();
        int[] weie = {12, 13, 15, 16, 23, 34, 35, 87, 65, 99, 123};
        for (int i = weie.length - 1; i >= 0; i--) {
            System.out.print(weie[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }

        System.out.println("Задача 4");

        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] % 2 != 0){
            arr[i] = arr[i] + 1 ;
                System.out.println(Arrays.toString(arr));
            }


        }
    }
}