
public abstract class Bird extends Animal implements CanFly{

	public Bird(String name) {
		super(name);
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " is pecking");
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("Breath in ... breath out, repeat.");
	}
	
    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
	
	

}
