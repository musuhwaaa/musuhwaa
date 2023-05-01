package day10.exam01;

public class Hydra implements Unit{
	String name;
	int hp;
	int attack;
	
	public Hydra(String name) {
		this(name,120,15);
	}
	
	public Hydra(String name, int hp, int attack) {
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
