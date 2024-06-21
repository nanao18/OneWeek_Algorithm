package primeNumber;

import java.util.Arrays;

public class Sample_1 {

	// 素数を求める (Find all Prime Number)
	// エラトステネスの篩 (Sieve of Eratosthenes)
	public static void main(String[] args) {
	    int n = 100;
		
		boolean[] primes = new boolean[n+1];
		Arrays.fill(primes, true);
		primes[0] = false;
		primes[1] = false;
		
		/*
		 * i*i <= n という条件は、各素数の倍数を判定する際の上限を決定するために用いられています。
		 * 具体的には、i が素数である場合、i の倍数 i*j (j > 1) は
		 * 既に他の素数の倍数としてマークされているため、再度マークする必要がありません。
		 * したがって、i の倍数をマークする際には、i*j が n より小さい範囲に収まっていることを
		 * 確認する必要があります。
		 * i*j <= n を満たす最大の j を求めるには、j = n / i を用いることができます。
		 * しかし、この方法では計算誤差が発生する可能性があるため、
		 * 代わりに i*i <= n という条件を使って、j の範囲を制限します。
		 */
		for(int i=2; i*i<=n; i++) {	
			//素数の場合、その素数の倍数をすべて false
			if(primes[i]) {
				for(int j=i*i; j<=n; j+=i) {
					primes[j] = false;
				}
			}
		}
		for(int i=2; i<=n; i++) {
			if(primes[i]) System.out.print(i + " ");
		}
	}
	
}
