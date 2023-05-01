package day10.exam01;

public class Dragoon implements Unit {
	String name;
	int hp;
	int attack;
	
	public Dragoon(String name) {
		this(name,180,20);
	}
	
	public Dragoon(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	@Override
	public int getAttack() {
		// TODO Auto-generated method stub
		return attack;
	}
	@Override
	public int getHp() {
		// TODO Auto-generated method stub
		return hp;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public void setHp(int hp) {
		// TODO Auto-generated method stub
		this.hp = hp;
	}
}
