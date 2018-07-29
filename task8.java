package lesson2;

public class task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array =  {134, 200, 201, 120, 340};
		double [] array2 = new double[5];
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] > max ) {
				
				max = array[i];
			}
						
		}
		
		System.out.println("max is " + max);
		// почему не разрешила написать k < array.length 
		for (int i = 0, k = 0; i < array2.length; i++, k++) {
			array2 [i] = (double)array[k]/max;
		}
		

		for(double arrayprint: array) {
			
			System.out.println(arrayprint);
		}
		for(double arrayprint: array2) {
			
			System.out.println(arrayprint);
		}
	}

}
