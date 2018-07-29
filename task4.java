package lesson2;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;
		int massiv [] = new int [100];
		for (int i = 1, k=0 ; i<massiv.length+1; i++, k++) {
			massiv[k]= i; 
			ch = massiv[k]%2;
			if ( ch == 0)
			System.out.println(massiv[k]);
		}
	}

}
