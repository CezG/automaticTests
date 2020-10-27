package units;

public enum UWeight {
	KG(1.0),
	G(0.001),
	DG(0.1),
	T(1000);
			
	public double converter;
	
	UWeight(double converter) {
		this.converter = converter;
	}
	

}
