package lesson2;

public class task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int max = 0;
		int massiv [] = new int [100];
		for (int i = 1, k=0 ; i<massiv.length+1; i++, k++) {
			massiv[k]= i;
			}
		for (int i = 0; i<massiv.length; i++) {
			if (massiv[i] > max)
			max = massiv[i]; 

		}
		System.out.println("max is " + max);
		

	}

}
