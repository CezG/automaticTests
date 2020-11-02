package units;

public class Unit<E extends Enum<E>> {
	public double value;
	public final E unit;

	public Unit(double value, E unit) {
		this.value = value;
		this.unit = unit;
	}

	public double getData() {
		return this.value * this.unit;
	}

//	public ULength unitLength;
//	public UWeight	unitWeight;
//	
//	
//	public Unit(double value,ULength unitLength) {
//		this.value = value;
//		this.unitLength = unitLength;
//		
//	}
//	
//	public Unit(double value,UWeight unitWeight) {
//		this.value = value;
//		this.unitWeight = unitWeight;
//		
//	}
//	
//	
//	public double getData() {
//		return this.value *this.unitLength.converter; 
//	}
//	
//	
//	public double convertTo(ULength y) {
//		double r= this.value * this.unitLength.converter;
//		return  r/y.converter ; 
//	}
//	
//	public double convertTo(UWeight y) {
//		double r= this.value * this.unitWeight.converter;
//		return  r/y.converter ; 
//	}
//
//	public void showData() {
//		double cal = this.value * this.unitLength.converter; 
//		System.out.println(cal);
//	}
//	
//	public static void main(String[]args) {
//		Unit l = new Unit(5,ULength.KM);
//		l.showData();
//		double su =l.convertTo(ULength.DM);
//		System.out.println(su);
//		
//		Unit w = new Unit(4,UWeight.KG);
//		//w.showData();
//		double wu =w.convertTo(UWeight.T);
//		System.out.println(wu);
//	}

}
