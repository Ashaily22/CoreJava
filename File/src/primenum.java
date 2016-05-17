
public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int totalnumtobechecked=20;
int numberofprimesofar=0;
boolean isprime=true;
for(int i=2;i<totalnumtobechecked;i++)
{
	isprime=true;
	
	for(int j=2; j<=i/2;j++)
	{
		if(i%j==0)
			isprime=false;
			
	}
	if(isprime)
	{
		System.out.println(i);
		numberofprimesofar++;
	}
	
	
}
	}

}
