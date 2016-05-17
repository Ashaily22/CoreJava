import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = new int[5];
System.out.println("Inputthe number");
Scanner sc=new Scanner(System.in);
for(int i =0; i<array.length;i++)
{array[i]=sc.nextInt();

	}
for(int j=0;j<array.length;j++)
System.out.println(array[j]);
	}

}
