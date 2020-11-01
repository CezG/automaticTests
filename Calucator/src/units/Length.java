package units;

public class Length extends AbstractUnit{
	
	public EnumLength unitLength;

	public Length(double value, EnumLength unitLength) {
		super(value);
		this.unitLength = unitLength;
	}

	@Override
	public double getData() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double convertTo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
