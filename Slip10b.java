
public class Slip10b {
    public static void main(String[] args) {
        int [] arr = {1,2,5,7,3,12,88,0};
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i]) max=arr[i];
        }
        System.out.println("Max is " + max);
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i]) min=arr[i];
        }
        System.out.println("Min is " + min);
    }
}