package ArrayPractice;

import java.util.Arrays;

import com.sun.tools.javac.util.ArrayUtils;

public class Homework {

	public static void main(String[] args) {
		char[] let = {'a','a','b','c','e'};
		char[] result = removeDuplicates(let);
		System.out.println(result);
		
		
		// TODO Auto-generated method stub

	}

public static char[] removeDuplicates(char[] in) {
	char[] out = {'a','b','c','c','d'};
	boolean[] array = new boolean[5];
	int x = 0;
	for(int i=0;i<array.length;i++) {
		array[i]=false;
	}
	for(int i=0; i<out.length;i++) {
		for(int j=0;j<out.length;j++) {
			if(out[i]==out[j]) {
				array[i]=true;
				x++;
			}
		}
	}
	char[] first= new char[out.length-x-1];
	
}
	
	
}


