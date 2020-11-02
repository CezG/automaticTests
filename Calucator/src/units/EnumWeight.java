package units;

public enum EnumWeight {
	KG(1.0),
	G(0.001),
	DG(0.1),
	T(1000);
			
	public double converter;
	
	EnumWeight(double converter) {
		this.converter = converter;
	}

}
