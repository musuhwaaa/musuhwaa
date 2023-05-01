package day10.exam01;

public class Zealot implements Unit {
	String name; 
	int hp;
	int attack;
	public Zealot(String name) {
		this(name,100,10);
	}
	public Zealot(String name, int hp, int attack) {
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
