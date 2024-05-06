import java.util.Scanner;

public class LinearSearch {
    public static int CheckList(int key, int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = {12, 89, 67, 545, 555, 22, 33, 44, 43};
        int key = sc.nextInt();
        int index = CheckList(key, list);
        if (index == -1) {
            System.out.println("Not found!!!");
        } else {
            System.out.println("Found at index " + index);
        }
        sc.close();
    }
}
