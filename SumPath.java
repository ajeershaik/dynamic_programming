import java.util.*;
class SumPath{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		System.out.println("enter elements into array");
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int[][] dp = new int[n][n];
		int k=n-1;
		for(int j=0;j<n;j++){
			dp[k][j] = arr[k][j];
		}
		/*System.out.println(Arrays.toString(dp));
		
		for(int[] a:dp){
			System.out.println(Arrays.toString(a));
		}*/
		
		for(int i=n-2;i>=0;i--){
			for(int j=0;j<=i;j++){
				dp[i][j] = Math.min(arr[i][j]+dp[i+1][j],arr[i][j]+dp[i+1][j+1]);
			}
		}
		
		for(int[] a:dp){
			System.out.println(Arrays.toString(a));
		}
		
		System.out.println("The minimun sum path is "+dp[0][0]);
	}
}