package operations;

import units.EnumLength;
import units.EnumWeight;
import units.Length;
import units.Weight;

public class Sum {

	public double sum(EnumLength unit, Length... table) throws IllegalArgumentException {

		double result = 0;
		if (table.length != 0) {
			for (Length x : table) {
				result += x.getData();
			}
			return result / unit.converter;

		} else {
			throw new IllegalArgumentException("There is no arguments");
		}
	}

	public double sum(EnumWeight unit, Weight... table) throws IllegalArgumentException {

		if (table.length != 0) {
			double result = 0;
			for (Weight x : table) {
				result += x.getData();
			}
			return result / unit.converter;
		} else {
			throw new IllegalArgumentException("There is no arguments");
		}

	}

//	public static void main(String[] args) {
//		
//		Length u1 = new Length(5, EnumLength.M);
//		u1.showData();
//		Length u2 = new Length(7, EnumLength.KM);
//		u2.showData();
//		Sum s = new Sum();
//		double r1 = s.sum(EnumLength.KM, u1, u2);
//		System.out.println(r1);
//		
//		
//
//		Weight u3 = new Weight(6, EnumWeight.KG);
//		u3.showData();
//		Weight u4 = new Weight(8, EnumWeight.T);
//		u4.showData();
//		Sum s2 = new Sum();
//		double r2 = s2.sum(EnumWeight.KG, u3, u4);
//		System.out.println(r2);
//		
//		s2.sum(EnumWeight.KG );
//	}

}
