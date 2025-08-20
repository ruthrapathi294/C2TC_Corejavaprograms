package abstract_examples;
public class TechTrainer extends Trainer {
	@Override
	public void session()
		{
			System.out.println("Java session Ongoing !!!! ");
		}
	@Override
		public void checks() {
			System.out.println("Assignments given from inheritance !!!! ");
		}
}