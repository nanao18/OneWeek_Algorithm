package primeFactorization;

import java.util.ArrayList;

public class Sample_1 {

	// 素因数分解を求める (Find all prime factorization)
	// 試し割り法(Trial division)
	public static void main(String[] args) {
	    int n = 100;
		
		ArrayList<Integer> prime_factors = new ArrayList<Integer>();
		for(int i=2; i*i<=n; i++) {	
			while(n % i == 0) {
				prime_factors.add(i);
				n = n / i;
			}
		}
		if(n > 1) {
			prime_factors.add(n);
		}
		for(Integer num: prime_factors) {
			System.out.print(num + " ");
		}
	}
	
}
