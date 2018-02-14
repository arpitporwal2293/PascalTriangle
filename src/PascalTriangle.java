
public class PascalTriangle {

	public static int fact(int n){
		if(n==0){
			return 1;
		}
		else return n==1?1:n * fact(n-1);
	}
	
	public static void printPascals(int n){
		for(int i=0;i<n;i++){
			for(int k=n-1;k>=i;k--){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print((fact(i)/(fact(k)*fact(i-k)))+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printPascals(5);
	}
	
}
