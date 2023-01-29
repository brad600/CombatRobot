package devoir2;

public class Arena {
public Arena() {}

public String fight(Robot R1, Robot R2) {
	final String gagnant;
	
	R1.fire(R2);
	do {
	if(!R2.isDead())R2.fire(R1);
	if(!R1.isDead())R1.fire(R2);
	}while( (!R1.isDead() )&& (!R2.isDead()) );
	if(R1.isDead())gagnant=R2.getnom();
	else gagnant=R1.getnom();
	
	return "Le gagnant de ce combat est : " + gagnant;
}

public String fight(Fighter F1, Fighter F2) {
	final String gagnant;
	
	do {
	if(!F1.isDead())F1.fire(F2);	
	if(!F2.isDead())F2.fire(F1);
	
	System.out.println(F1.getnbrVie() +" "+ F2.getnbrVie());
	}while( (!F1.isDead() )&& (!F2.isDead()) );
	if(F1.isDead())gagnant=F2.getnom();
	else gagnant=F1.getnom();
	
	return "Le gagnant de ce combat est : " + gagnant;
}

public String fight(Fighter F, Robot R) {
	final String gagnant;
	
	do {
	if(!F.isDead())F.fire(R);	
	if(!R.isDead())R.fire(F);
	
	System.out.println(F.getnbrVie() +" "+ R.getnbrVie());
	}while( (!F.isDead() )&& (!R.isDead()) );
	if(F.isDead())gagnant=R.getnom();
	else gagnant=F.getnom();
	
	return "Le gagnant de ce combat est : " + gagnant;
}
	public static void main(String[] args) {

		
		try {
		
		Arena A= new Arena();
		
		//COMBAT ENTRE DEUX ROBOTS
		/*
		Robot R1= new Robot("D2R2");
		Robot R2= new Robot("Data");
		System.out.println(R1.getnom());
		System.out.println(R2.getnom());
		System.out.println(A.fight(R1,R2));//*/
		
		//COMBAT ENTRE DEUX HUMAINS
		/*
		Fighter F1= new Fighter("frank");
		Fighter F2= new Fighter("shaolin");
		System.out.println(F1.getnom());
		System.out.println(F2.getnom());
		System.out.println(A.fight(F1,F2));*/
		
		
		//COMBAT ROBOT-HUMAIN
		//*
		Fighter F= new Fighter("frank");
		Robot R= new Robot("D2R2",10);
		System.out.println(F.getnom());
		System.out.println(R.getnom());
		System.out.println(A.fight(F,R));
	
		}
		
		
		//*/
		
		// A Activer en cas de robot combattant 
		//*
		catch(ErrVieException E)
		{
			System.out.println("ERREUR: la vie est obligatoirement initialisée à 10pts");
			System.exit(-1);
		}//*/

	//finally {}
	

	}}
