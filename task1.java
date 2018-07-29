package lesson2;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int massiv [] = new int [100];
		for (int i = 1, k=0 ; i<massiv.length+1; i++, k++) {
			massiv[k]= i; 
			
			System.out.println(massiv[k]);
		}
	}

}
