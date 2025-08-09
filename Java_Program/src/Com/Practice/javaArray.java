package Com.Practice;

import java.util.Arrays;

public class javaArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,0,2,0,0,2,0,4,0,0,0,0};
		//secondHigh(arr);
		//rev(arr);
		//int ans[]=rev(arr);
	//	int k=3;
       // rotateArr(arr,k);	
		int k=3;
		//rotate(arr,k);
		SortEle(arr);
	}
	// Move to all zero to last
	static int [] SortEle(int arr[]) {
		int putnonZero=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
		int temp=arr[putnonZero];
		arr[putnonZero]=arr[i];
		arr[i]=temp;
		putnonZero++;
		}
		}
	System.out.println(Arrays.toString(arr));
	return arr;
}}

	/*static int[] ArrayRev(int arr[],int i,int j) {
		
		while(i<j) {
	  int temp=arr[i];
	  arr[i]=arr[j];
	  arr[j]=temp;
	  i++;
	  j--;
		}
		return arr;
	}
	static void rotate(int arr[],int k) {
		int n=arr.length;
		 k=k%n;
		ArrayRev(arr,0,k-1);
		ArrayRev(arr,k,n-1);
		ArrayRev(arr,0,n-1);
	
System.out.println(Arrays.toString(arr));
}}
/*	static void rotateArr(int arr[],int k) {
		int n=arr.length;
		int ans[]=new int [n];
		int j=0;
		k=k%n;
		for(int i=n-k;i<n;i++) {
			ans[j++]=arr[i];
		}
		for(int i=0;i<n-k;i++) {
			ans[j++]=arr[i];
		}
		System.out.println(Arrays.toString(ans));
	}


}
	/*reverse the array in place
	//static int [] rev(int arr[]) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}
	}
	/* Reverse the Array
	static int [] rev(int arr[]) {
		int n=arr.length;
		int j=0;
		int ans[]=new int[n];
		for(int i=n-1;i>=0;i--) {
			ans[j++]=arr[i];
		}
		System.out.println(Arrays.toString(ans));
		return ans;
		
	}
	
}
	/* Find second high element in array
	static void secondHigh(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max){
				max=arr[i];	
			}
		}
		int SecondMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]!=max && arr[i]>SecondMax) {
			SecondMax=arr[i];
		}
		}
		System.out.println(SecondMax);
	}
}
		/* Find the unique element in the array
		int arr[]= {1,2,3,4,5,1,2,3,4};
		uniqueEle(arr);
	}
	static void uniqueEle(int arr[]) {
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(arr[i]==arr[j]) {
				arr[i]=-1;
				arr[j]=-1;
			}
		}}
		int ans=0;
		for(int i=0;i<n;i++) {
		if(arr[i]>0) {
			ans=arr[i];
		}}
		System.out.println(ans);
		}
	}
	
		/* reverse the string while pursing a white space
		String str="J y o t i";
		str=str.replaceAll("\\s+", "");
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	}
		/* in array shifts all the 0s to the front using single array you are not allowed to use another array
		int arr[]= {34,0,9,5,7,4,0,4,0,2,3};
		int ans[]=shiftAllZeroTofront(arr);
		for(int a:ans) {
			System.out.print(a+" ");
		}
	}
	
	static int [] shiftAllZeroTofront(int arr[]) {
		int i=0;int j=arr.length-1;
		while(i<j) {
			if(arr[i]!=0 && arr[j]==0) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
		}
			if(arr[i]==0) {
				i++;
			}
			if(arr[j]!=0) {
				j--;
			}
		}
		return arr;
	}}
	/*static int [] shiftAllZeroToFront(int arr[]) {
		//int j=arr.length;
		int nonZero = 0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==0) {
			int temp=arr[nonZero];
			arr[nonZero]=arr[i];
			arr[i]=temp;
			nonZero++;
		}
	}
		return arr;
	}
	}
		/*int a=11;
		int b=23;
		int min=a>b?a:b;
		System.out.println(min);
	}
	}
		/*int arr[]= {1,0,3,4,0,0,5,0,6,0,8,0,0};
		int ans[]=ZeroTolast(arr);
		for(int a:ans)
			System.out.print(a+" ");
	}
	static int [] ZeroTolast(int arr[]){
		int i=0; int j=arr.length-1;
		while(i<j) {
		if(arr[i]%2==0 && arr[j]%2!=0) {
			
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
		}
		if(arr[i]%2!=0) {
			i++;
		}
		if(arr[j]%2==0) {
			j--;
		}}
		return arr;
	}}
	
		/* remove all zero to the last
		int arr[]= {1,0,3,4,5,6,7,8,9 ,0};
		int ans[]=ZeroToLast(arr);
		for(int a:ans)
			System.out.print(a+" ");
	}
 static int [] ZeroToLast(int arr[]) {
	 int j=0;
	 for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			j++;
		}
	 }
	 return arr;
 }
}
*/