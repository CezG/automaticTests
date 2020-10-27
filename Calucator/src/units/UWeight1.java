package units;

public class UWeight1 {

	public double kg;
	public double g =  kg*1000;
	public double dg = kg*10;
	public double t =  kg/1000;
	
	public UWeight1(double kg, double g, double dg, double t) {
		this.kg = kg;
		this.kg = g/1000;
		this.kg = dg/10;
		this.kg = t*1000;
	}

	public double getKg() {
		return kg;
	}

	public void setKg(double kg) {
		this.kg = kg;
	}

	public double getG() {
		return g;
	}

	public void setG(double g) {
		this.g = g;
	}

	public double getDg() {
		return dg;
	}

	public void setDg(double dg) {
		this.dg = dg;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}
	
	
	
	
}
