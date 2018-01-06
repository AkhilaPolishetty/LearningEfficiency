abstract class Animal{
	
	protected String name;
	private int order;
	public Animal(String n){
		this.name =n;
	}
	public void setOrder(int order){
		this.order = order;
	}
	public int getOrder(){
		return order;
	}

	public boolean isOlderThan(Animal a){
		return this.order< a.getOder();
	}
}

public class Dog extends Animal{
	public Dog(String n){
		super(n);
	}
}

public class Cat extends Animal{
	public Cat(String n){
		super(n);
	}
}

public class AnimalQueue{
	
	private int order =0;
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();

	public void enqueue(Animal a){
		a.setOrder(order);
		order++;
		if(a instanceOf Dog) dogs.addLast((Dog)a);
		if(a instanceOf Cat) cats.addLast((Cat)a);
	}

	public Animal dequeueAny(){

		if(dogs.size()==0)
			return dogDequeue();
		if(cats.size()==0)
			return catDequeue();

		Dog dog = dogs.peek();
		Cat cat = cat.peek();

		if(dog.isOlderThan(cat)){
			return dogDequeue();
		}else{
			return catDequeue();
		}

	}

	public Animal dogDequeue(){
		return dogs.poll();
	}

	public Animal catDequeue(){
		return cats.poll();
	}
}