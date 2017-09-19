package songnie;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class solve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<String,String>();
		Scanner scnr = new Scanner("5\n" + 
				"9\n" + 
				"0\n" + 
				"7\n" + 
				"11\n" + 
				"24");
		int n = scnr.nextInt();
		int[] nums = new int[n];
		int i = 0;
		while (i < n) {
			nums[i] = scnr.nextInt();
			i += 1;
		}
		String table = "4 * 4 * 4 * 4\n" + 
				"256\n" + 
				"4 * 4 * 4 + 4\n" + 
				"68\n" + 
				"4 * 4 * 4 - 4\n" + 
				"60\n" + 
				"4 * 4 * 4 / 4\n" + 
				"16\n" + 
				"4 * 4 + 4 * 4\n" + 
				"32\n" + 
				"4 * 4 + 4 + 4\n" + 
				"24\n" + 
				"4 * 4 + 4 - 4\n" + 
				"16\n" + 
				"4 * 4 + 4 / 4\n" + 
				"17\n" + 
				"4 * 4 - 4 * 4\n" + 
				"0\n" + 
				"4 * 4 - 4 + 4\n" + 
				"16\n" + 
				"4 * 4 - 4 - 4\n" + 
				"8\n" + 
				"4 * 4 - 4 / 4\n" + 
				"15\n" + 
				"4 * 4 / 4 * 4\n" + 
				"16\n" + 
				"4 * 4 / 4 + 4\n" + 
				"8\n" + 
				"4 * 4 / 4 - 4\n" + 
				"0\n" + 
				"4 * 4 / 4 / 4\n" + 
				"1\n" + 
				"4 + 4 * 4 * 4\n" + 
				"68\n" + 
				"4 + 4 * 4 + 4\n" + 
				"24\n" + 
				"4 + 4 * 4 - 4\n" + 
				"16\n" + 
				"4 + 4 * 4 / 4\n" + 
				"8\n" + 
				"4 + 4 + 4 * 4\n" + 
				"24\n" + 
				"4 + 4 + 4 + 4\n" + 
				"16\n" + 
				"4 + 4 + 4 - 4\n" + 
				"8\n" + 
				"4 + 4 + 4 / 4\n" + 
				"9\n" + 
				"4 + 4 - 4 * 4\n" + 
				"-8\n" + 
				"4 + 4 - 4 + 4\n" + 
				"8\n" + 
				"4 + 4 - 4 - 4\n" + 
				"0\n" + 
				"4 + 4 - 4 / 4\n" + 
				"7\n" + 
				"4 + 4 / 4 * 4\n" + 
				"8\n" + 
				"4 + 4 / 4 + 4\n" + 
				"9\n" + 
				"4 + 4 / 4 - 4\n" + 
				"1\n" + 
				"4 + 4 / 4 / 4\n" + 
				"4\n" + 
				"4 - 4 * 4 * 4\n" + 
				"-60\n" + 
				"4 - 4 * 4 + 4\n" + 
				"-8\n" + 
				"4 - 4 * 4 - 4\n" + 
				"-16\n" + 
				"4 - 4 * 4 / 4\n" + 
				"0\n" + 
				"4 - 4 + 4 * 4\n" + 
				"16\n" + 
				"4 - 4 + 4 + 4\n" + 
				"8\n" + 
				"4 - 4 + 4 - 4\n" + 
				"0\n" + 
				"4 - 4 + 4 / 4\n" + 
				"1\n" + 
				"4 - 4 - 4 * 4\n" + 
				"-16\n" + 
				"4 - 4 - 4 + 4\n" + 
				"0\n" + 
				"4 - 4 - 4 - 4\n" + 
				"-8\n" + 
				"4 - 4 - 4 / 4\n" + 
				"-1\n" + 
				"4 - 4 / 4 * 4\n" + 
				"0\n" + 
				"4 - 4 / 4 + 4\n" + 
				"7\n" + 
				"4 - 4 / 4 - 4\n" + 
				"-1\n" + 
				"4 - 4 / 4 / 4\n" + 
				"4\n" + 
				"4 / 4 * 4 * 4\n" + 
				"16\n" + 
				"4 / 4 * 4 + 4\n" + 
				"8\n" + 
				"4 / 4 * 4 - 4\n" + 
				"0\n" + 
				"4 / 4 * 4 / 4\n" + 
				"1\n" + 
				"4 / 4 + 4 * 4\n" + 
				"17\n" + 
				"4 / 4 + 4 + 4\n" + 
				"9\n" + 
				"4 / 4 + 4 - 4\n" + 
				"1\n" + 
				"4 / 4 + 4 / 4\n" + 
				"2\n" + 
				"4 / 4 - 4 * 4\n" + 
				"-15\n" + 
				"4 / 4 - 4 + 4\n" + 
				"1\n" + 
				"4 / 4 - 4 - 4\n" + 
				"-7\n" + 
				"4 / 4 - 4 / 4\n" + 
				"0\n" + 
				"4 / 4 / 4 * 4\n" + 
				"0\n" + 
				"4 / 4 / 4 + 4\n" + 
				"4\n" + 
				"4 / 4 / 4 - 4\n" + 
				"-4\n" + 
				"4 / 4 / 4 / 4\n" + 
				"0";
		Scanner sc = new Scanner(table);
		while (sc.hasNextLine()){
			String value = sc.nextLine();
			String key = sc.nextLine();
			if (map.get(key) == null)
			map.put(key, value);
		}
		for (int num : nums){
			if (map.get(num+"") != null){
				System.out.println(map.get(num+"") + " = " + num);
			}
			else 
				System.out.println("no solution");
			
		}
	}

}
