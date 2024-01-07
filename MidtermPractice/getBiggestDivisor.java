package MidtermPractice;

import acm.program.ConsoleProgram;

public class getBiggestDivisor extends ConsoleProgram {
	public void run(){
		int number = 24;
		println(biggestPrimeDivisor(number));
	}
	
	private int biggestPrimeDivisor(int num){
		int maxDivisor = 0;
		for(int i = 2; i < num; i++){
			if(isPrime(i) && num % i == 0){
				if(i > maxDivisor){
					maxDivisor = i;
				}
				
			}
		}
		return maxDivisor;
		
	}
	
	private boolean isPrime(int num){
		for(int i = 2; i < num ; i++){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}
}
