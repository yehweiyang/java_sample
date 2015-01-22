package ch7;

public class Human implements Swimmer,Flyer{
	private String name;
	public Human(String name){
		this.name=name;
	}
	public String getName(){
		
		return name;
	}
	@Override
	public void swim() {
		System.out.printf("¤HÃþ%s ´åªa%n",name);
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
