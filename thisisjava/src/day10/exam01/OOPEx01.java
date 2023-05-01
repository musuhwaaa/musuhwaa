package day10.exam01;

public class OOPEx01 {
	

	static void attack(Unit u1, Unit u2) {
		u1.setHp(u1.getHp()-u2.getAttack());
		System.out.println(u1.getName()+"이 "+u2.getName()+"에게 공격당해 체력" +u1.getHp()+"이 되었습니다." );
	}
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot("질럿1");
		Dragoon d1 = new Dragoon("드라군1");
		Hydra h1 = new Hydra("히드라1");
		attack(z1,d1);

		
	}
}











