package units;

public abstract class AbstractUnit {
	
	public double value;

	public AbstractUnit(double value) {
		this.value = value;
	}
	
	public abstract double getData();
//	public abstract <E extends Enum<E>> double convertTo(E unit) throws InstantiationException, IllegalAccessException;
	public abstract void showData();
	
	

}
