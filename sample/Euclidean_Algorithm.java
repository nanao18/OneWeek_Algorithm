package sample;

public class Euclidean_Algorithm {

	/* ユークリッドの互除法（Euclidean Algorithm）
	 * 2 つの自然数の最大公約数を求める手法の一つ
	 */
	public static void main(String[] args) {
    int m = 128; //1つめの数字
    int n = 72;  //2つめの数字

    int l = m;
    int s = n;
		while(true){
			if(l > s) {
        l = l - s;
      } else if (s < l) {
        s = s - l;
      } else {
        break;
			}
      System.out.println(a +"と"+ b +"の最大公約数は、"+ l);
		}
	}
}
