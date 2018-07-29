package lesson2;

public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0, nech=0, s=0;
		int massiv [] = new int [100];
		for (int i = 1, k=0 ; i<massiv.length+1; i++, k++) {
			massiv[k]= i; 
			s = massiv[k]%2;
			if ( s == 0)
				ch++;
			else
				nech++;
				
//			System.out.println(massiv[k]);
		}
		System.out.println(ch);
		System.out.println(nech);
	}

}
