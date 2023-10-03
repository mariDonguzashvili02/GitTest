import stanford.karel.Karel;
//7. კარელი დგას 1x1 უჯრაზე, შეავსებინეთ მას მთელი სამყარო თითო ბრილიანტით. ანუ მთელ
//სამყაროში ყველა უჯრაზე უნდა იდოს ზუსტად ერთი ბრილიანტი. ჩათვალეთ რომ საწყისი
//სამყარო ცარიელი არ არის და გარკვეულ(ჩვენთვის უცნობ) უჯრებში თითო(მხოლოდ ერთი)
//ბრილიანტი დევს. ამასთან გაითვალისწინეთ, რომ სამყაროს ზომები თქვენთვის უცნობია და
//თქვენი პროგრამა უნდა მუშაობდეს ნებისმიერი ზომის სამყაროსათვის.
public class Problem07 extends Karel{
	public void run(){
		while (beepersInBag()){
//			next line exists
//			go to next line start position
			goToNextLineStart();
//			fill line
			fillLine();
			
		}
		
	}

	private void fillLine() {
		if (noBeepersPresent()){
			putBeeper();
		}
		while(frontIsClear()){
			move();
			if(noBeepersPresent()){
				putBeeper();
			}
		}
	}

	private void goToNextLineStart() {
		// TODO Auto-generated method stub
		
	}
	

}
	

