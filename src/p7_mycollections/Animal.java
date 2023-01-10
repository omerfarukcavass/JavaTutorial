package p7_mycollections;

public class Animal {

	int age;
	String name;
	
	public Animal(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + "]";
	}

	// HashSet compares hash codes to check if two objects are the same.
	// So, if you dont override hashCode method it behaves as they are different objects 
	// although equals says they are same.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	//  says true if they have the same data
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	/*
	 * You must override hashCode() in every class that overrides equals(). 
	 * Failure to do so will result in a violation of the general contract for Object.hashCode(), 
	 * which will prevent your class from functioning properly in conjunction with all hash-based 
	 * collections, including HashMap, HashSet, and Hashtable.
	 */
	
	
	
	
}
