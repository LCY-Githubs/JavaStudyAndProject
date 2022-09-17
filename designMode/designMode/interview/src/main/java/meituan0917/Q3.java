package meituan0917;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Q3 {

    static int x;
    static int y;
    static int n;
    static int[] arrX;
    static int[] arrY;

    /*
    5 2 3
    3 4
    2 5 1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        sc.nextLine();
        arrX = new int[2 * n];
        String[] split = sc.nextLine().split(" ");
        for (int i = 0; i < split.length; i++) {
            arrX[i] = Integer.parseInt(split[i]);
        }
        arrY = new int[2 * n];
        String[] splitY = sc.nextLine().split(" ");
        for (int i = 0; i < splitY.length; i++) {
            arrY[i] = Integer.parseInt(splitY[i]);
        }
        ptrX = x - 1;
        ptrY = y - 1;
        handle();
    }

    static int ptrX;
    static int ptrY;

    public static void handle() {
        //模拟
        int count = 0;
        while (judge()) {
            //找到最小的球的位置
            findMinVal();
            //判断是否处于顶端
            if (isUp()) {
                //如果是，则取出，进行下一轮循环
                if (bucket == 0) {
                    arrX[ptrX] = 0;
                    ptrX--;
                } else {
                    arrY[ptrY] = 0;
                    ptrY--;
                }

            } else {
                //如果不是，则移动该桶的球到另外一个桶
                if (bucket == 0) {
                    arrY[++ptrY] = arrX[ptrX];
                    arrX[ptrX--] = 0;
                } else {
                    arrX[++ptrX] = arrY[ptrY];
                    arrY[ptrY--] = 0;
                }
            }
            count++;
        }
        System.out.println(count);
    }

    static int bucket;

    static int min;

    public static void findMinVal() {
        if (arrX[0] != 0) {
            min = arrX[0];
            bucket = 0;
        } else {
            min = arrY[0];
            bucket = 1;
        }
        for (int i = 0; i < 2 * n; i++) {
            if (arrX[i] != 0 && arrX[i] < min) {
                min = arrX[i];
                bucket = 0;
            }
        }
        for (int i = 0; i < 2 * n; i++) {
            if (arrY[i] != 0 && arrY[i] < min) {
                min = arrY[i];
                bucket = 1;
            }
        }
    }

    public static boolean isUp() {
        if (bucket == 0) {
            return arrX[ptrX] == min;
        } else {
            return arrY[ptrY] == min;
        }
    }

    public static boolean judge() {
        for (int i = 0; i < 2 * n; i++) {
            if (arrX[i] != 0) {
                return true;
            }
        }
        for (int i = 0; i < 2 * n; i++) {
            if (arrY[i] != 0) {
                return true;
            }
        }
        return false;
    }
}
