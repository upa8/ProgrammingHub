package com.upa.testing;

import com.upa.templates.MyScanner;

public class CrazzyRing extends MyScanner {

	public static void main(String args[]) throws Exception {
		CrazzyRing in = new CrazzyRing();
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();

		double side1 = Math
				.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		double side2 = Math
				.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
		double side3 = Math
				.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));

		// get radius of circumcircle
		double r1 = Triangle.circumcircleRadius(side1, side2, side3);// in.radiusOfCircumCicle(side1,
																		// side2,
		// get radius of incircle
		double r2 = Triangle.innerCircleRadius(side1, side2, side3);// in.radiusOfIncircle(side1,
																	// side2,
		// side3);

		double area1 = r1 * r1 * Math.PI;
		double are2 = r2 * r2 * Math.PI;
		double ans = Math.abs(are2 - area1);
		ans = in.round(ans, 2);
		double checker = 0.0;
		if (ans <= checker) {
			System.out.println("Not possible");
		} else {
			System.out.println(ans);
		}

	}

	public double radiusOfCircumCicle(double x, double y, double z) {

		double m = x * y * z;
		double p = x + y + z;
		double q = (x + y) - z;
		double r = (x + z) - y;
		double s = (z + y) - x;
		double n = p * q * r * s;
		if (n <= 0) {
			return -1;
		}
		double ans = m / Math.sqrt(n);

		return ans;
	}

	public double radiusOfIncircle(double x, double y, double z) {

		double sum = x + y + z;
		double perimeter = sum / 2;
		double mult = Math.abs(perimeter - x) * Math.abs(perimeter - y)
				* Math.abs(perimeter - z);

		double step3Mult = mult * perimeter;
		double sqroot = Math.sqrt(step3Mult);
		double ans = sqroot / perimeter;

		return ans;
	}

	public static double round(double value, int places) {
		double roundOff = Math.round(value * 100.0) / 100.0;
		return roundOff;
	}

	static class Triangle {

		// method for circumcircleRadius

		public static double circumcircleRadius(double sideA, double sideB,
				double sideC)

		{
			double t = (sideA * sideB * sideC);

			double sum = (sideA + sideB + sideC) * ((sideB + sideC) - sideA)
					* ((sideC + sideA) - sideB) * ((sideA + sideB) - sideC);

			double s = t / Math.sqrt(sum);

			return s;

		}

		// method for the radius of the inner circle of the triangle

		public static double innerCircleRadius(double sideA, double sideB,
				double sideC) {
			double k = perimeter(sideA, sideB, sideC) / 2;

			double r = k * (k - sideA) * (k - sideB) * (k - sideC);

			double radius = Math.sqrt(r) / k;
			return radius;

		}

		// method for the perimeter of the inner circle of the triangle
		public static double perimeter(double sideA, double sideB,
				double sideC) {

			double sides = sideA + sideB + sideC;

			return sides;
		}

		// method for the bisector of the triangle of the triangle
		public static double bisector(double b, double c, double alpha) {
			double p = 2 * b * c * Math.cos(alpha / 2);
			double bis = p / (b + c);
			return bis;
		}

		// method for the area of the triangle
		public static double area(double sideA, double sideB, double sideC) {
			double v = perimeter(sideA, sideB, sideC) / 2;
			double half = Math
					.sqrt(v * (v - sideA) * (v - sideB) * (v - sideC));
			return half;
		}

	}
}
