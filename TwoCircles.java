package com.test.study;

import java.util.ArrayList;

public class TwoCircles {
	public static void main(String[] args) {
		String[] inf = {"0 5 9 0 9 7","0 15 11 0 20 16" ,"26 0 10 39 0 23","37 0 5 30 0 11","41 0 0 28 0 13"};
		circles(inf);
	}

	static String[] circles(String[] info) {
		ArrayList<String> al=new ArrayList<String>();
		for (int i = 0; i < info.length; i++) {
			String te = info[i];
			String[] xe = te.split(" ");

			int x1 = Integer.parseInt(xe[0]), y1 = Integer.parseInt(xe[1]);
			int x2 = Integer.parseInt(xe[3]), y2 = Integer.parseInt(xe[4]);
			int r1 = Integer.parseInt(xe[2]), r2 = Integer.parseInt(xe[5]);
			System.out.println(x1+" "+x2+" "+r1+" "+y1+" "+y2+" "+r2+" ");
			double result = Math.hypot(x1 - x2, y1 - y2);
			if (result == Math.abs(r1 - r2) || result == (r1 + r2))
				al.add("Touching");
			else if (result < (r1 - r2))
				al.add("Disjointinside");
			else if (result > (r1 + r2))
				al.add("Disjoint-outside");
			else if (x1 == x2 && y1 == y2)
				al.add("Concetric");
			else if ((r1 - r2) < result && result < (r1 + r2))
				al.add("Intersecting");
		}
		String[] op=new String[al.size()];
		System.out.println(al);
		for (int i = 0; i < op.length; i++) {
			op[i]=al.get(i);
		}
		return op;

	}
}
