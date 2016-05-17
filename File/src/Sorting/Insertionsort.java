package Sorting;

public class Insertionsort {

	public static void main(String[] args) {
		int [] array ={4,7,3,1,9,5,2,8,9};
		int temp=0;
		for(int i=0;i<=array.length; i++);// Number list
		{
			int i = 0;
			for(int c=i; c>=0;c--)
			{
				if(array[c+1]<array[c])
				{
					temp=array[c];
					array[c]=array[c+1];
					array[c+1]=temp;
				}
			}
		}
		
		for(int x=0;x<=array.length;x++)
		{
			System.out.println(x);
		}
	}

}
