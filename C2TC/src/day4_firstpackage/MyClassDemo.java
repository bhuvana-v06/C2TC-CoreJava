package day4_firstpackage;

public class MyClassDemo {
	public static void main (String[] args) {
		MyClass st = MyClass.getObj();
		st.setId(101);
		st.setName("bhuvana");
		
		MyClass mc1 = MyClass.getObj();
		System.out.println(mc1);
		System.out.println(st);
	}

}
