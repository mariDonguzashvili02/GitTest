package MidtermPractice;

import acm.program.ConsoleProgram;

//შესაძლებელია თუ არა ერთი სიტყვის სიმბოლოებისგან მეორე სიტყვის მიღება? ამ ამოცანის გადასაჭრელად დაწერეთ მეთოდი spellWord, 
//რომელსაც გადაეცემა ორი სტრინგი და აბრუნებს ბულეანს. თქვენი მიზანია პირველი სტრინგიდან მეორე მიიღოთ. ამისათვის შეგიძლიათ პირველი 
//სტრინგიდან გარკვეული სიმბოლოების ამოჭრათ ხოლო დარჩენილი სიმბოლოები გადააადგილოთ როგორც გინდათ ისე. თუკი პირველი სტრინგიდან
//მეორის მიღება შესაძლებელია მაშინ მეთოდი უნდა აბრუნებდეს true-ს, წინააღმდეგ შემთხვევაში false-ს. 
//მაგალითად თუკი გადმოგეცათ სტრინგები “gamarjoba” და “baro” მაშინ მეთოდმა უნდა დააბრუნოს true. ხოლო თუ გადმოგეცათ სტრინგები “gamarjoba” 
//და “oboba” მაშინ მეთოდმა უნდა დააბრუნოს false. 
//ამოცანა შეასრულეთ SpellWord.java ფაილში 

public class SpellWord extends ConsoleProgram{
	public void run(){
		String first = "gamarjoba";
		String second = "baro";
		if(isSpellable(first, second)){
			println("true");
			
		}else{
			println("false");
		}
		
	}
	
	private boolean isSpellable(String first, String second){
		int sameLetter = 0; 
		String wantText = second;
		for(int i = 0; i < first.length(); i++){
			char c = first.charAt(i);
			String letter = "" + c;
			if(wantText.contains(letter)){
				wantText = removeChar(wantText, c);
				sameLetter++;
			}
		}
		if(sameLetter == second.length()){
			return true;
		
		}
		return false;
	}
	
	private String removeChar(String text, char c){
		String res = "";
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) != c){
				res+= text.charAt(i);
			}
		}
		return res;
	}
}
