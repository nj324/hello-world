package ArrayPractice;

public class arrays {

	public static void main(String[] args) {
		double[] array = {1.2,3.5,0.5};
		boolean result = isStrictlyIncreasing(array);
		System.out.println(result);		
		

	}
	public static boolean isStrictlyIncreasing(double[] in) {
		boolean x= true;
		for(int i=0; i<in.length-1;i++) {
			if(in[i]>in[i+1]) {
				x = false;
				
			}
			
			
		}
		return x;
	}
}

