package Com.Java;

public class findSecondHighestNumberInArray {
public static void main(String[] args) {
	int arr[]= {9,4,3,2,6,7,1,5};
	maxSecondArray(arr);
	
}
static void maxSecondArray(int arr[]) {
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
		max=arr[i];
		}
	}
	System.out.println(max);
	int SecondMax=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
	if(arr[i]!=max && arr[i]> SecondMax) {
		SecondMax=arr[i];
	}
	}
	System.out.println(SecondMax);
}
}

