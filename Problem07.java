import stanford.karel.Karel;
//7. კარელი დგას 1x1 უჯრაზე, შეავსებინეთ მას მთელი სამყარო თითო ბრილიანტით. ანუ მთელ
//სამყაროში ყველა უჯრაზე უნდა იდოს ზუსტად ერთი ბრილიანტი. ჩათვალეთ რომ საწყისი
//სამყარო ცარიელი არ არის და გარკვეულ(ჩვენთვის უცნობ) უჯრებში თითო(მხოლოდ ერთი)
//ბრილიანტი დევს. ამასთან გაითვალისწინეთ, რომ სამყაროს ზომები თქვენთვის უცნობია და
//თქვენი პროგრამა უნდა მუშაობდეს ნებისმიერი ზომის სამყაროსათვის.
public class Problem07 extends Karel{
	public void run(){
		while (beepersInBag()){
			
			while (facingEast()){
				fillTheRow();
				
			}
			while(facingWest()){
				fillTheRow();
				
			}
		
		}
	}
	private void fillTheRow(){
		while (frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
				move();
			}
			if(beepersPresent()){
				move();
				
			}
		}
		while(frontIsBlocked()){
			if(noBeepersPresent()){
				if(facingEast()){
				putBeeper();
				turnLeft();
				move();
				turnLeft();
			
				}
				if(facingSouth()){
					putBeeper();
					turnRight();
					move();
					turnRight();
				}
				
			}
			}
		
		
	}
	private void turnRight(){
		turnLeft();
		turnLeft();
		turnLeft();
	}

}
	

