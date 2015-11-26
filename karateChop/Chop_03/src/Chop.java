


public class Chop {

	public int chop(int searchNumber, int[] arrayToSearch){
		
		// Comprobamos si el vector > 0
		if (arrayToSearch.length == 0) {
			return -1;
		}
		
		//1 comprobar el medio
		int halfIndex = arrayToSearch.length /2;
		int result = arrayToSearch[halfIndex];

				
		if(result == searchNumber){
			return halfIndex;
		}
		
		if (arrayToSearch.length == 1) {
			return -1;
		}
		
		//2- no  lo ha encontrado, dividimos vector original
		int[] halfArray ;
		int offSet = 0;
		if (searchNumber < arrayToSearch[halfIndex]) {
			//if(halfIndex%2==0)
			halfArray= new int[halfIndex];
			System.arraycopy(arrayToSearch, 0, halfArray, 0, halfIndex);
		} else {
			halfArray= new int[arrayToSearch.length - (halfIndex+1)];
			System.arraycopy(arrayToSearch, halfIndex +1, halfArray, 0, arrayToSearch.length - (halfIndex+1) );
			offSet = halfIndex +1;
		}		
		
		//3 llamamos al chop
		
		int resultado = chop(searchNumber, halfArray);
		
		if(-1 != resultado){
			return offSet + resultado; 
		}else {
			return -1;		
		}
		
				
	};	
}
