package units;

public class Weight extends AbstractUnit{

	public EnumWeight unit;

	public Weight(double value, EnumWeight unit) {
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

	public double convertTo(EnumWeight newUnit) {
		double r = this.value * this.unit.converter;
		return r / newUnit.converter;
	}

	public static void main(String[] args) {
		Weight l = new Weight(7, EnumWeight.KG);
		l.showData();
		Weight l2 = new Weight(1, EnumWeight.DAG);
		l2.showData();
		
		System.out.println(l2.convertTo(EnumWeight.G));
		double su = l.convertTo(EnumWeight.T);
		System.out.println(su);

		// Unit w = new Unit(4,UWeight.KG);
		// w.showData();
		// double wu =w.convertTo(UWeight.T);
		// System.out.println(wu);
	}

}
