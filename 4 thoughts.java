package songnie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
public class Solution {
	static HashMap<Integer,String> map = new HashMap<Integer,String>();
	static List<String> operands = new ArrayList<String>();
	static List<String> eqs = new ArrayList<String>();
	public static void main(String[] args) throws ScriptException {
		Scanner scnr = new Scanner("5\n9\n0\n7\n11\n24\n");
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
		int n = scnr.nextInt();
		int[] nums = new int[n];
		int i = 0;
		while (i < n) {
			nums[i] = scnr.nextInt();
			i += 1;
		}
		solve(nums);
		for (String oper:operands){
			String temp = oper.replaceAll("0", "*").replaceAll("1", "+").replaceAll("2", "-").replaceAll("3", "/");
			String tempeq = "4 "+temp.substring(0, 1)+" 4 "+temp.substring(1, 2)+" 4 "+temp.substring(2, 3)+" 4"+temp.substring(3);
			System.out.println(tempeq);
			eqs.add(tempeq);
			System.out.println(engine.eval(tempeq));
		}
	}

	public static long solve(int[] nums) {
		int curr = 4;
		int[] ans = new int[100];
		
		for (int i = 0;i <= 3;i++){
			for (int j = 0;j <= 3;j++){
				for (int k = 0;k <= 3;k++){
					String temp = i+""+j+""+k+"";
					operands.add(temp);
				}
			}
		}
		
		return curr;
		
		
	}
	
}