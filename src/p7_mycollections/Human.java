package p7_mycollections;

public class Human implements Comparable<Human>{

	int age;
	public Human(int age) {
		this.age=age;
	}
	
	
	@Override
	public int compareTo(Human o) {
		
		if(this.age>o.age) {
			return 1;
		}
		else if(this.age<o.age) {
			return -1;
		}
		return 0;
	}


	@Override
	public String toString() {
		return "Human [age=" + age + "]";
	}
	
	
	
}
