package units;

public class Length extends AbstractUnit {

	private EnumLength unit;
	private double unitValue;

	public Length(double value, EnumLength unit) {
		super(value);
		this.unit = unit;
		this.unitValue = unit.converter;
	}

	public EnumLength getUnit() {
		return unit;
	}

	public void setUnit(EnumLength unit) {
		this.unit = unit;
	}

	public double getUnitValue() {
		return unitValue;
	}

	public void setUnitValue(double unitValue) {
		this.unitValue = unitValue;
	}

	@Override
	public double getData() {
		return this.value * this.unitValue;
	}

	@Override
	public void showData() {
		double cal = this.value * this.unitValue;
		System.out.println(cal);

	}

	public double convertTo(EnumLength newUnit) {
		double r = this.value * this.unitValue;
		return r / newUnit.converter;
	}

//	@Override
//	public <E extends Enum<E>> double convertTo(E unit) throws InstantiationException, IllegalAccessException {
//		double r= this.value * this.unitLength.converter;
//		return  r/ (double)unit.getDeclaringClass().getConstructors();
//	}

	public static void main(String[] args) {
		Length l = new Length(5, EnumLength.KM);
		l.showData();
		double su = l.convertTo(EnumLength.DM);
		System.out.println(su);
	}

}
