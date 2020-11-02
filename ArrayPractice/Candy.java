package ArrayPractice;

public class Candy {

	public static void main(String[] args) {
		int[] order1 = {10,0,3,4,7};
		int[] order2 = {0,4,0,1,2};
		int[] result = combineOrder(order1,order2);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		
		
		
		

	}
	public static int [] combineOrder(int[] a, int[] b) {
		int[] order = new int [5];
		for(int i=0; i<order.length;i++) {
			order[i]=a[i]+b[i];
		}
		return order;
	}

}
