package Lec2;

public class TimeComplexcity {

	public static void main(String[] args) {
		int n=1000000;
		//O(sqrt(n))
		for(int i=1;i*i<=n;i++) {
			System.out.println(1);
		}
		
		for (int i = 0; i < n; i++) {
			for(int j=i;j<=i;j++) {
				System.out.println(j);
			}
		}

	}

}
