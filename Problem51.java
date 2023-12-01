import acm.program.ConsoleProgram;

//51. დაწერეთ მეთოდი რომელიც გადაცემული ტექსტიდან შლის დუბლირებულ სიმბოლოებს,
//ანუ თუ ტექსტიში რომელიმე სიმბოლო მეორდება, უნდა დარჩეს მხოლოდ ყველაზე მარცხენა.

public class Problem51 extends ConsoleProgram{
	public void run(){
		String text = readLine("Enter text: ");
		println(removeDuplicates(text));
	}	
	private String removeDuplicates(String text){
		String result = "";
		for(int i = 0; i < text.length(); i++){
			char c = text.charAt(i);
			if(result.charAt(i) == -1){
				result += c;
			}
		}
		return result;
	}
}
