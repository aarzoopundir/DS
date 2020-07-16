import java.util.*;
public class LinearSearch {
	public static int linearSearch(int[] arr, int ele){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == ele){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
    	Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
        int[] arr= new int[n]; 
        for(int i=0;i<n;i++)
        {
        	arr[i]=s.nextInt();
        }
        int ele=s.nextInt();    
        System.out.println(ele+" is found at index: "+linearSearch(arr, ele));    
    }    
}
