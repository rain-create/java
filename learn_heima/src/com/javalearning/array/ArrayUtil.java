package com.javalearning.array;

//工具类案例
public class ArrayUtil {
    //私有构造方法，不让外界创建对象
    private ArrayUtil() {
    }

    ;

    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                sb.append(arr[i]).append(",");
            } else {
                sb.append(arr[i]);
            }

        }
        sb.append("]");
        return sb.toString();
    }

    public static  double getAverage(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        double avg = sum / arr.length;
        return avg;
    }


}
