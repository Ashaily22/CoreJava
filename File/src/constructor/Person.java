package constructor;

public class Person {
String name;
int age;
public Person(String name)
{
	this.name=name;
	System.out.println(name);
	}
public Person(String name, int age)

{
	this.name=name;
	this.age=age;
	System.out.println(name+ "" + age);
	
}
}
