import org.weyrauch.csis.week16.AbstractionDemonstrator;


public class Person extends AbstractionDemonstrator {

	private int mHeight; // Measured in inches
	
	Person(boolean ismale, int height) {
		super(ismale);
		mHeight = height;
	}

	@Override
	public double grossIncome() {
		
		// This function must be overridden
		// or the class must also be declared abstract
		return 0;
	}

}
