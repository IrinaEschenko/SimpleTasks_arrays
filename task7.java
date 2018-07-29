package lesson2;

public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0, min = 0, indexMax = 0, indexMin = 0;
		int massiv [] = new int [100];
		for (int i = 1, k=0 ; i<massiv.length+1; i++, k++) {
			massiv[k]= i;
			}
		max = massiv[0];
		for (int i = 0; i<massiv.length; i++) {
			if (massiv[i] > max) {
				
				max = massiv[i];
				indexMax = i;
			}

		}
		System.out.println("max is " + max);
		
		min = massiv[0];	
		for (int i = 0; i<massiv.length; i++) {
			if (massiv[i] < min) {
					
					min = massiv[i];
					indexMin = i;
			}
		}
		System.out.println("min is " + min);
		massiv[indexMax] = min;
		massiv[indexMin] = max;
		for(int mas : massiv) {
			System.out.println(mas);
			
		}
		
	}

}
