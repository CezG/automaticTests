package units;

public abstract class AbstractUnit {
	
	public double value;

	public AbstractUnit(double value) {
		this.value = value;
	}
	
	public abstract double getData();
	public abstract double convertTo();

}
