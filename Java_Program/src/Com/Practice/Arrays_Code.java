package Com.Practice;

import java.util.Arrays;

public class Arrays_Code {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8,9};
	
}}
/*	int k=4;
	int ans[]=rotateArr(arr,k);
	System.out.println(Arrays.toString(ans));
}*/
/*
static int [] rotateArr(int arr[],int k){
int n=arr.length;
int ans[]=new int[n];
k=k%n;
int j=0;
for(int i=k;i<n;i++){
ans[j++]=arr[i];
}
for(int i=0;i<k;i++){
ans[j++]=arr[i];
}
return ans;
}
}

static int [] rotateArr(int arr[],int k){
int n=arr.length;
int ans[]=new int[n];
k=k%n;
int j=0;
for(int i=n-k;i<n;i++){
ans[j++]=arr[i];
}
for(int i=0;i<n-k;i++){
ans[j++]=arr[i];
}
return ans;
}
}
/*static int [] revArr(int arr[]){
int i=0; int j=arr.length-1;
while(i<j){
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
i++;
j--;
}
return arr;
}}
/*static int [] RevArr(int arr[]){
int n=arr.length;
int ans[]=new int[n];
int j=0;
for(int i=n-1;i>=0;i--){
ans[j++]=arr[i];
}
System.out.println(Arrays.toString(ans));
return ans;
}



}
/*	int arr[]= {1,2,3,4,5,6,7,8,9};
	SecondMax(arr);
}
	// Find the SecondLargest number 
static void SecondMax(int arr[]) {
int max=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++) {
for(int j=i+1;j<arr.length;j++) {
	if(arr[i]>arr[j]) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
}
System.out.println(arr[1]);
}
}
/*	static void SecondMax(int arr[]){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
		if(arr[i]>max){
		max=arr[i];
		}}
		int secondMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
		if(arr[i]!=max && arr[i]>secondMax){
		secondMax=arr[i];
		}}
		System.out.println(secondMax);
		}}
	
	
	/* Find the unique number in array
	public static void main(String[]args){
	int arr[]={1,2,3,4,5,1,2,3,4};
	UniqueEle(arr);
	}
	static int UniqueEle(int arr[]){
	for(int i=0;i<arr.length;i++){
	for(int j=i+1;j<arr.length;j++){
	if(arr[i]==arr[j]){
	arr[i]=-1;
	arr[j]=-1;
	}}}
	int ans=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++){
	if(arr[i]>0){
	ans=arr[i];
	}}
	System.out.println(ans);
	
	return ans ;

	}}

*/