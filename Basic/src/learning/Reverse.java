package learning;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[] {1,2,3,4,5};
		System.out.println("Original");
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+ " ");
		}
		System.out.println(" ");
		System.out.println("Reverse");
		
		for(int i=arr1.length-1; i>=0;i--) {
			System.out.print(arr1[i]+" ");
		}
	}

}
