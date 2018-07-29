package lesson2;

public class task31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int massivin [] = new int [50] ;
		
		for (int i=0, k=2; i<=massivin.length-1; i++, k=k+2){
			massivin[i] = k;
			System.out.println(massivin[i]);
		}
	}

}
