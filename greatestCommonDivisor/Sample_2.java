package greatestCommonDivisor;

public class Sample_2 {

	// 最大公約数を求める (Find the greatest common divisor)
	// 引き算の繰り返しで最大公約数を求めるプログラム
	public static void main(String[] args) {
	    int m = 876; //1つめの数字
	    int n = 204;  //2つめの数字
	
	    int l = m;
	    int s = n;
		while(true){
			if(l > s) {
				l = l - s;
			} else if (s > l) {
				s = s - l;
			} else {
				break;
			}
		}
		System.out.println(m +"と"+ n +"の最大公約数は、"+ l);
	}
}
