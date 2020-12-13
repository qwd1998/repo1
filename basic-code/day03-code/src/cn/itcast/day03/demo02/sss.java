package cn.itcast.day03.demo02;

public class sss {
    public static void main(String[] args) {
        int [] array = {1112,2,3,4,5,6,7,8,9,10};
        int max1 = getmax(array);
        System.out.println(max1);
    }

    public static int  getmax(int [] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i])
                max  =  array[i];

        }
        return max;
    }
}
