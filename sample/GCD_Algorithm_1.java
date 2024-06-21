package sample;

public class GCD_Algorithm_1 {

	// Find the greatest common divisor
	// ユークリッドの互除法(Euclidean algorithm)
	public static void main(String[] args) {
	    int m = 876; //1つめの数字
	    int n = 204;  //2つめの数字
	    int l, s, d;
	    //  m < nであれば、mとnを入れ替える
	    if(m > n) {
	    	l = m; s = n;
	    } else {
	    	l = n; s = m;
	    }
	    do {
	    	d = l % s;
	    	l = s;
	    	s = d;
	    } while(d !=0);
		System.out.println(m +"と"+ n +"の最大公約数は、"+ l);
	}
}
