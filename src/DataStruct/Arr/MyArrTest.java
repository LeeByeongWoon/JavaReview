package DataStruct.Arr;

import java.util.Arrays;

public class MyArrTest {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.addElement(1);
        myArray.addElement(2);
        myArray.addElement(3);
        myArray.addElement(4);
        myArray.addElement(5);
        myArray.addElement(6);
        System.out.println(myArray.ARRAY_SIZE);
        System.out.println(myArray.count);
        myArray.insertElement(3,7);
        System.out.println(myArray);

        int[] arr = new int[10];
        for(int i=0;i<6;i++){
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
        int a = myArray.removeElement(3);
        System.out.println(a);
        System.out.println(myArray);
    }
}
