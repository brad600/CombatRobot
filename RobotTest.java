package devoir2;

import junit.framework.TestCase;

public class RobotTest extends TestCase {
	Robot R= new Robot();
	boolean b=R.isDead();
	
	public void testgetnbrVie() {

        assertEquals(10,R.getnbrVie());
    }
	
	public void testgetnom() {

        assertEquals("",R.getnom());
    }
	
	public void testIsDead() {
		
		assertEquals(b,R.isDead());
	}


}
