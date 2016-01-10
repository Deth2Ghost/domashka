package students;

import java.util.Arrays;

public class Students {
	String fio;
	int age;
	int group;
	int[] marks;
	
public String getFio() {
		return fio;
	}
	public void setFio(String fio) {
		this.fio = fio;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
Students(String fio, int age, int group, int[] marks) {
	// TODO Auto-generated constructor stub
	this.fio = fio;
	this.age = age;
	this.group = group;
	this.marks = marks;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Студент: "+fio+" Возраст: "+age+" Гуппа: "+group+"\nОценки: "+Arrays.toString(marks);
	
}
}
