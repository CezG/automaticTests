package units;

public enum EnumLength {
	M(1.0),
	MM(0.001),
	CM(0.01),
	DM(0.1),
	KM(1000);
			
	public double converter;
	
	EnumLength(double converter) {
		this.converter = converter;
	}

}
