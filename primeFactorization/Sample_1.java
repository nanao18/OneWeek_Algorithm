package primeFactorization;

import java.util.ArrayList;

public class Sample_1 {

	// 素因数分解を求める (Find all prime factorization)
	public static void main(String[] args) {
	    int n = 100;
		
	    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	    for(ArrayList<Integer> li : list){
	        for(int j = 0; j < li.size(); j++){
	        	System.out.println(list.get(j));
	        }
	    }
	}
	
}
