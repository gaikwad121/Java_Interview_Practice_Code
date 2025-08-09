package Com.Java;

public class findMissingNumInArray {

	public static void main(String[] args) {
int num[]= {1,2,4,5,6};

System.out.println("Missing number is: " + findMissingNumber(num));
	}
// sum=0;
/*int num1[]= {1,2,3,4,5,6};

int sum=0;
int sum1=0;
for(int i=0;i<num.length;i++) {
	sum=sum+num[i];
}
for(int i=0;i<num1.length;i++) {
	sum1=sum1+num1[i];
}
int sub=sum1-sum;
System.out.println(sub);
}
	}*/


	

// formula is : n(n+1)/2
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // since one number is missing
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    }

