package ArrayPractice;





public class homework4 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,10,10,10,4};
		int[] result = remove(10,arr);
		for(int i = 0; i<result.length;i++) {
			System.out.print(result[i]);
			
		}
		System.out.println(5+"7");
		
		
		// TODO Auto-generated method stub

	}
	public static int[] remove(int v, int[] in) {
		int c = 0;
		for(int i=0;i<in.length;i++) {
			if(in[i]==v) {
				c++;
			}
			
		}
		int[] out = new int[in.length-c];
		int x=0;
		for(int i=0;i<in.length;i++) {
			if(in[i] != v) {
				out[x]=in[i];
				x++;
			}
			
		}
		return out;
		
		
	}
}
		
		