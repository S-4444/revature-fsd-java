package week2Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class Id_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Person person1 = new Person(1, "John", 15);
		Person person2 = new Person(2, "Smith", 25);
		Person person3 = new Person(3, "Stella", 32);
		Person person4 = new Person(4, "Maria", 42);
		Person person5 = new Person(5, "Janet", 42);
		
		List<Person> personList = new ArrayList<>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		personList.add(person5);
		
		System.out.println("Enter id :");
	   Scanner sc = new Scanner(System.in);
	   int id = sc.nextInt();
	   
	    personList.stream()
				.filter(p -> p.getId()== id ).forEach(System.out::println);
	
	
	    personList.stream().filter(e -> e.getId()==id).forEach(e -> System.out.println("The person name is :"+ e.getName()));
	}

}
