package practice;

public class Student {
	public int id;
	public String name;
	public String city;

public Student() {
	this.id = 12;
	this.name = "john";
	this.city = "chennai";

}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
}

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

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
}
