package abstract_examples;
public class TnsifCgDemo {

	public static void main(String[] args) {
		
		Trainer t = new SoftSkillTrainer(); // object creation for the SoftskillTrainer Class
		
		t.session();
		t.checks();
		
		t = new TechTrainer();  //  object creation for the TechTrainer Class
		
		t.session();
		t.checks();
		
		
	}

}