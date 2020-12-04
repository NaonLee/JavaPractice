package inheritancePractice;

class Animal{
	public void move() {
		System.out.println("동물이 움직인다.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷는다.");
	}
	public void readBook(){
		System.out.println("책을 읽는다");
	}
}


class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 뛴다.");
	}
	public void hunting(){
		System.out.println("사냥을 한다");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 난다.");
	}
	public void feather(){
		System.out.println("깃털을 고른다.");
	}
}



public class PolymoPhism {
	
	public static void main(String[] args) {
		
		PolymoPhism test = new PolymoPhism();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		

	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
		if (animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		}
		else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}
		else if(animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.feather();
		}
		else
			System.out.println("Unsupported function");
	}

}
