package learning;

public class LargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[] {25,95,66,85,14,26};
		
		int max=arr1[0]; //25
		
		for(int i=0;i<arr1.length;i++)	{
			if(arr1[i]>max) //25>25
			{
				max = arr1[i]; //95
			}
			
		}
		System.out.println("Largest number is: "+max);
	}

}
