import stanford.karel.Karel;
//3. კარელი დგას 1x1 უჯრაზე, გაიყვანეთ იგი პირველი ქუჩის ბოლომდე. გაითვალისწინეთ, რომ
//სამყაროს ზომა არ იცით. თქვენი პროგრამა უნდა მუშაობდეს ნებისმიერი ზომის
//სამყაროსათვის.
public class Problem03 extends Karel {
	public void Run(){
		while(frontIsClear()){
			
			move();
	
		}
	}
	

}
