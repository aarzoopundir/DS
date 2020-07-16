import java.util.*;
public class OptimizedBubbleSort {
		  void bubbleSort(int array[]) {
		    int size = array.length;
		    for (int i = 0; i < size - 1; i++) {
		      boolean swapped = true;
		      for (int j = 0; j < size - i - 1; j++) {
		        if (array[j] > array[j + 1]) {
		          int temp = array[j];
		          array[j] = array[j + 1];
		          array[j + 1] = temp;
		          
		          swapped = false;
		        }
		      }
		      
		      
		      if (swapped == true)
		        break;
		    }
		  }

		 
		  public static void main(String args[]) {
			  Scanner s=new Scanner(System.in);
			  int n=s.nextInt();
		    int[] data = new int[n];
		    for(int i=0;i<n;i++)
		    {
		    	data[i]=s.nextInt();
		    }
		    OptimizedBubbleSort bs = new OptimizedBubbleSort();
		    bs.bubbleSort(data);
		    System.out.println("Sorted Array in Ascending Order:");
		    for(int i=0;i<n;i++)
		    {
		    	System.out.println(data[i]);
		    }
		    	
		  }
		}
