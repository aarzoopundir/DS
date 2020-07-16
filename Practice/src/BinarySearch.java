import java.util.*;
public class BinarySearch {
	public static void binarySearch(int arr[],int low,int high,int ele)
	{
		int mid=(low+high)/2;
		while(low<=high)
		{
			if(ele>arr[mid]) {
				low=mid+1;
			}
			else if(arr[mid]==ele)
			{
				System.out.println("element is found at index: "+ mid);
				break;
			}
			else {
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		
	}
 public static void main(String args[]) {
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int[] arr=new int[n];
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=s.nextInt();
	 }
	 int ele=s.nextInt();
	 int high=n-1;
	 int low=0;
	 binarySearch(arr,low,high,ele);
 }
}
