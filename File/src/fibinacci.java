
public class fibinacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int limit=10;
int pre=1;
int next=0;
for(int i=1; i<=limit;i++)
{
	next=next+pre;
	pre=next-pre;
			
System.out.println(pre);
	}

}
}