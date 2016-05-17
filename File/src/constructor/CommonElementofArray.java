package constructor;

public class CommonElementofArray {

	public static void main(String[] args) {
		int[] array1={4,7,3,9,5,8};
		int[] array2={8,3,6,1,2,5};
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0; j<array2.length;j++)
			{
				if(array1[i]==array2[j])
				{
					System.out.println(array1[i]);
				}
			}
		}
	}

}
