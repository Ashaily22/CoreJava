package List;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinklist {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		list.add("Azmiri");
list.add("Sultana");
list.addFirst("Shaily");
 Iterator<String> it= list.iterator();
 while(it.hasNext())
 {
	 System.out.println(it.next());
 }

	}

}
