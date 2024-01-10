import java.util.HashMap;

import acm.program.ConsoleProgram;
import acm.program.Program;

public class nothing extends ConsoleProgram {
	//private HashMap<String, nothing> statistics = new HashMap<String, nothing>();

	private String name;
	private int[] ranks;
	public void run(){
		String line = "Barbara 143 85 18 3 3 6 22 73 153 296 511";
		nothing(line);
		String entry = toStrings();
		print(entry);
	}
	
	public String getName() {

		return name;
	}
	
//	public nothing findEntry(String name) {
//		if(statistics.containsKey(name)){
//			return statistics.get(name);
//		}
//		return null;
//	}
	
	private String toStrings() {
		String line = name + " " + "[" + ranks[0];
		for(int i = 1; i < ranks.length; i++){
			line += " " + ranks[i];
		}
		line += "]";
		return line;
	}

	private void nothing(String line) {
		String[] statistics = line.split(" ");
		name = statistics[0];
		ranks = intConverter(statistics, 1);

	}
	
	private int[] intConverter(String[] arr, int index) {
		int[] converted = new int[arr.length];
		int n = 0;
		for (int i = index; i < arr.length; i++) {
			converted[n] = Integer.parseInt(arr[i]);
			n++;
		}
		return converted;
	}
}
