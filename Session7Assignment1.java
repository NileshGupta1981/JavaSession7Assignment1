public class Session7Assignment1 {
	
	public static void main (String args[]){
		
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
				
		for (int i = 0; i <=5 ; i++ ){
			try {
				
				System.out.println ((i+1)+" position of array is "+ array[i]);
			}
			catch (ArrayIndexOutOfBoundsException E){
				
				System.out.println ((i+1)+" Index value is out of bound for array");
			}
			
		}
	}
	
}