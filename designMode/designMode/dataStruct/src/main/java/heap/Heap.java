package heap;

import java.util.LinkedList;

public class Heap<T extends Comparable<T>> {

    //存放堆的数组
    T[] items;

    //the size of heap
    int N;


    public Heap(int capacity) {
        //the T can not be init direct
        //this.items = new T[capacity];
        items = (T[]) new Comparable[capacity + 1];
        this.N = 0;
    }

    public int size() {
        return this.N;
    }

    //判断与对比
    public boolean less(int i, int j) {
        return items[i].compareTo(items[j]) < 0;
    }

    //交换两处的值
    public void exch(int i, int j) {
        T item = items[i];
        items[i] = items[j];
        items[j] = item;
    }

    //插入
    public void insert(T t) {
        //将元素插入到数组的最后一个元素中
        items[++N] = t;
        //将最后一个元素采用上浮算法，一直到处于正常位值
        swim(N);
    }

    public void swim(int k) {
        //通过循环，不停的比较索引k出的值和其父节点的值，若比父节点大，则交换两个节点的值
        while (k > 1) {
            if (less(k / 2, k)) {
                exch(k / 2, k);
            }
            k = k / 2;
        }
    }

    //删除堆中的最大元素，并返回这个元素
    public T delMax() {
        //get the max value of the heap
        T max = items[1];
        //exch the max and the last element
        exch(1, N);
        //set the last element to null
        items[N] = null;
        N--;
        sink(1);
        return max;
    }

    //下沉调整堆，使得堆更加有序
    //重新放置索引k出的值，使得最大堆变得有序
    public void sink(int k) {
        //通过不断循环比较索引K处的值和其左子节点2*k以及右子节点2*k+1的值
        //如果左右某子节点比当前k节点大，则进行交换
        while (2 * k <= N) {
            //记录当前较大节点的索引
            int max;
            if (2 * k + 1 <= N) {
                //右子节点存在
                max = less(2 * k, 2 * k + 1) ? 2 * k + 1 : 2 * k;

            } else max = 2 * k;
            //比较大节点和父子节点
            if (!less(k, max)) {
                break;
            }
            exch(k, max);
            //变换k的值
            k = max;
        }
    }

    public static void main(String[] args) {
        String s= "dasda";
        s.substring(0,s.length()-1);
    }


}
