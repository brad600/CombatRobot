package devoir2;

import junit.framework.TestCase;
public class testArena extends TestCase {
	
	 Arena A=new Arena();
	Robot R1 = new Robot("D2R2");
	Robot R2 = new Robot("Data");
	Robot R3 = new Robot("Dodo");
	Fighter F1= new Fighter("Franklin");
	Fighter F2= new Fighter("Shaolin");
	Fighter F3= new Fighter("Cyril");
	
	String SRR= A.fight(R1, R2);
	String SFF= A.fight(F1, F2);
	String SFR= A.fight(F3, R3);
	
	public void testfight1() {
		assertEquals(SRR,A.fight(R1, R2));
	}
	
	public void testfight2() {
		assertEquals(SFF,A.fight(F1, F2));
	}
	
	public void testfight3() {
		assertEquals(SFR,A.fight(F3, R3));
	}

}
