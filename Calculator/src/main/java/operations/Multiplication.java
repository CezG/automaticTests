package operations;

import units.EnumLength;
import units.EnumWeight;
import units.Length;
import units.Weight;

public class Multiplication {

	public double multiplication(EnumLength unit, Length... table) throws IllegalArgumentException {

		double result = 1;
		if (table.length != 0) {
			for (Length x : table) {
				result *= x.getData();
			}
			return result / Math.pow(unit.converter, table.length);
		} else {
			throw new IllegalArgumentException("There is no arguments");
		}
	}

	public double multiplication(EnumWeight unit, Weight... table) throws IllegalArgumentException {

		if (table.length != 0) {
			double result = 1;
			for (Weight x : table) {
				result *= x.getData() / unit.converter;
			}
			return result ;
		} else {
			throw new IllegalArgumentException("There is no arguments");
		}

	}

//	public static void main(String[] args) {
//
//		Length u1 = new Length(5, EnumLength.KM);
//		u1.showData();
//		Length u2 = new Length(7000, EnumLength.M);
//		u2.showData();
//		Multiplication m = new Multiplication();
//		double r1 = m.multiplication(EnumLength.KM, u1, u2);
//		System.out.println(r1);
//
//		Weight u3 = new Weight(2, EnumWeight.KG);
//		u3.showData();
//		Weight u4 = new Weight(1, EnumWeight.G);
//		u4.showData();
//		Multiplication m2 = new Multiplication();
//		double r2 = m2.multiplication(EnumWeight.G, u3, u4);
//		System.out.println(r2);
//
//		m2.multiplication(EnumWeight.G);
//	}

}
