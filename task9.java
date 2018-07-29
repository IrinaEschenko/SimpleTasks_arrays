package lesson2;

public class task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int [5];
		for (int i = 0; i < array.length; i++) {
			
			array[i] = (int) (Math.random() * 10);
			System.out.println("---" + array[i]);
			
		}
		int tmp = 0;
		for(int i = 0; i < array.length-1; i=i+2) {
			
			tmp = array[i];
			array[i] = array[i+1];
			array[i+1]= tmp;
		//	
		}
		
		for(int ar : array) {
			
			System.out.println(ar);
		}
	}

}
