package learning;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[] {1,2,3,4,5};
		System.out.println(arr1.length);
		int[] arr2 = new int[arr1.length];
		System.out.println("Original");
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+ " ");
		}
		
		System.out.println(); 
		
		for(int i=0; i<arr1.length;i++) {
			arr2[i] = arr1[i]; // arr2[0] = arr1[0]
		}
		
		System.out.println("Duplicate");
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i]+ " ");
		}
		
	}

}
