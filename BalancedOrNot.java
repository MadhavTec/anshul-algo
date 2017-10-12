package com.test.study;

import java.util.ArrayList;
import java.util.Stack;

public class BalancedOrNot {

	public static void main(String[] args)
	{

		String[] exp={"<>","<>><"};
		int[] maxre={1,0};
		balancedOrNot(exp, maxre);
	}

	static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {

		int maxreplacement = 1;
		boolean result = false;
		Stack<Integer> stk = new Stack<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int t = 0; t < expressions.length; t++) {
			String exp = expressions[t];
			StringBuffer temp = new StringBuffer(exp);
			int len = exp.length();
			for (int i = 0, j = 0; i < len; i++) {
				char ch = exp.charAt(i);
				if (ch == '<') {
					stk.push(i);
					temp.deleteCharAt(i - j);
					j++;
				} else if (ch == '>') {
					try {
						int p = stk.pop() + 1;
						temp.deleteCharAt(i - j);
						j++;
						result = true;
					} catch (Exception e) {
						result = false;
						break;
					}
				}
			}
			if (temp.length() == maxreplacement && !containsStartParentesis(temp))
				result = true;
			if (result) {
				al.add(1);
			} else {
				al.add(0);
			}

		}
		int[] op=new int[al.size()];
		for(int t = 0; t < op.length; t++){
			op[t]=al.get(t);	
		}
		return op;

	}

	private static boolean containsStartParentesis(StringBuffer temp) {
		if (temp.toString().contains("<"))
			return true;
		return false;
	}

}
