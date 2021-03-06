package sort;

/**
 * 选择排序
 * 在未排序序列中找到最小元素，放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小元素
 * 然后放到已排序序列的末尾，循环直到所有元素均排序完毕。
 * <p>
 * 1、初始状态：无序区为R[1..n]，有序区为空
 * 2、第i趟排序(i=1,2,3…n-1)开始时，当前有序区和无序区分别为R[1..i-1]和R[i..n]
 * 该趟排序从当前无序区中选出最小的记录 R[k]，将它与无序区的第1个记录R[i]交换，使R[1..i]和R[i+1..n]分别变为记录个数增加1个的新有序区和记录个数减少1个的新无序区
 * 3、循环n-1次，排序完成
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {5, 2, 9, 4, 7, 6, 1, 3, 8};
        int minIndex, temp;
        for (int i = 0; i < a.length - 1; i++) { //外层循环，从无序区第一个元素开始到数组倒数第二个元素，时间复杂度N
            minIndex = i; //每次外层循环假设无序区第一个元素是最小元素
            for (int j = i + 1; j < a.length; j++) {    //内层循环，从假设的最小元素的后一个位置开始，到数组最后一个元素，时间复杂度N
                if (a[j] < minIndex) { //判断内层循环的元素是否小于假设的最小元素
                    minIndex = j; //如果比最小元素小，标记该元素的位置为新的最小元素的位置，内层循环完毕，会找出无序区的最小值
                }
            }
            temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;    //无序区真正最小值和第一个元素交换位置，下一次循环无序区从下一个值开始
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}
