import acm.program.ConsoleProgram;

public class nothing extends ConsoleProgram {
	private String name;
	private int[] ranks;
	public void run(){
		String line = "Barbara 143 85 18 3 3 6 22 73 153 296 511";
		NameSurferEntry(line);
		print(name);
		for(int i = 0; i < ranks.length; i++){
			print(" " + ranks[i]);
		}
	}
	
	private void NameSurferEntry(String line) {
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
