package lab4;

public class Person {
	private String name;
	private float age;
	
	public Person() {};
	
	public Person(String name,float age)
	{
		this.name=name;
		this.age=age;
	}
	
	//getters and setters for name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//getters and setters for age
	public float getAge() {
		return age;
	}
	
	public void setAge(float age) {
		this.age = age;
	}
	
}
