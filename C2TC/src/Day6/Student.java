package Day6;

public class Student {
	private String name;
	private static int id;
	private int reg;
	public Student() {
		id++;
		reg++;
		System.out.println("constructor called");
	}
	public int getReg() {
		return reg;
	}
	public void setReg(int reg) {
		this.reg = reg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Student.id = id;
	}
	@Override
	public String toString() {
		return "Student [id:"+id+", reg=" + reg + ", name=" + name + "]";
	}
	
	

}
