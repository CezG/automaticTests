package units;

public class Length extends AbstractUnit {

	public EnumLength unit;

	public Length(double value, EnumLength unit) {
		super(value);
		this.unit= unit;
	}

	@Override
	public double getData() {
		return this.value * this.unit.converter;
	}

	@Override
	public void showData() {
		double cal = this.value * this.unit.converter;
		System.out.println(cal);

	}

	public double convertTo(EnumLength newUnit) {
		double r = this.value * this.unit.converter;
		return r / newUnit.converter;
	}

//	@Override
//	public double convertTo(EnumLength unit) {
//		double r= this.value * this.unitLength.converter;
//		return  r/unit.converter;
//		}

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

		// Unit w = new Unit(4,UWeight.KG);
		// w.showData();
		// double wu =w.convertTo(UWeight.T);
		// System.out.println(wu);
	}

}
