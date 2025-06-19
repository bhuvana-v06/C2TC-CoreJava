package day4_firstpackage;

public class MyClass {
	private static MyClass s1 = new MyClass();
	public static MyClass getObj() {
		return s1;
	}
	private int id;
	private MyClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MyClass [id=" + id + ", name=" + name + "]";
	}
	
}	