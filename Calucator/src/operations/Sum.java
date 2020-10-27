package operations;

import units.Unit;
import units.ULength;
//import units.UWeight;

public class Sum {

	public double sum(ULength unitLength,Unit...table) {
		double result = 0;
		for(Unit x : table ) {
			result += x.getData();
		}
		return  result/unitLength.converter ; 
	}

	
//	public static void main(String[]args) {
//		Unit u1 = new Unit(5,ULength.M);
//		u1.showData();
//		Unit u2 = new Unit(7,ULength.KM);
//		u2.showData();
//		Sum s= new Sum();
//		double r=s.sum(ULength.KM,u1,u2);
//		System.out.println(r);
//	}
	
	
}
