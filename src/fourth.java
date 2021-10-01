import java.util.Arrays;
import java.util.Scanner;
public class fourth {
    public static void change(int arr[], int a, int b){
        int t= arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
    public static void main(String[] args){
        int array[] = new int[10];
        for (int i=0;i<10;i++){
            array[i]=(int)(Math.random()*(-10-10)+10);
        }
        System.out.println(Arrays.toString(array));
        boolean right=true;
        while(right){
            right = false;
            for(int i=1;i<array.length;i++){
                if (array[i]<array[i-1]){
                    change(array, i, i-1);
                    right=true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
