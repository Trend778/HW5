public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();
        task4();
    }

    public static void task1_2() {
        System.out.println("Задания 1 и 2:");

        //Первый массив
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] == arr.length ? arr[i] : arr[i] + ",");
        }
        System.out.println();

        //Второй массив
        double[] secondArray = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.print(i == secondArray.length - 1 ? secondArray[i] : secondArray[i] + ",");
        }
        System.out.println();

        //Третий массив
        int thirdArray[] = new int[6];
        for (int k = 0; k < thirdArray.length; k++) {
            thirdArray[k] = k + 1;
            System.out.print(thirdArray[k] == thirdArray[thirdArray.length - 1] ? thirdArray[k] + "\n" : thirdArray[k] + ",");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задание 3:");

        //Первый массив
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = i + 1;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] == arr[0] ? arr[i] : arr[i] + ",");
        }
        System.out.println();

        //Второй массив
        double[] secondArray = {1.57, 7.654, 9.986};
        for (int i = secondArray.length - 1; i >= 0; i--) {
            System.out.print(i==0 ? secondArray[i] : secondArray[i] + ",");
        }
        System.out.println();

        //Третий массив
        int thirdArray[] = new int[6];
        for (int k = 0; k < thirdArray.length; k++) {
            thirdArray[k] = k + 1;
        }
        for (int i = thirdArray.length - 1; i >= 0; i--) {
            System.out.print(thirdArray[i] == thirdArray[0] ? thirdArray[i] + "\n" : thirdArray[i] + ",");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задание 4:");

        //Первый массив
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = i + 1;
        }
        for (int forthTaskVar : arr) {
            if (forthTaskVar % 2 != 0) {
                forthTaskVar++;
            }
            System.out.print(forthTaskVar== arr.length-1 ? forthTaskVar + "," : forthTaskVar);
        }
    }
}