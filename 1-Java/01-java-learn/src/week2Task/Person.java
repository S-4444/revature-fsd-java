package week2Task;

public class Person implements Comparable<Person>{
	
	private int id ; 
	private String name;
	private int age;
	

	public Person(int id, String name, int age) {
//		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public long getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}

   
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public int compareTo(Person o) {
		
		return 0;
	}
	

}
