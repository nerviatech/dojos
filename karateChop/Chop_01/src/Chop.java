
public class Chop {
	
	public int chop(int i, int[] arr){
		if (arr != null && arr.length > 0) {
			int initialPosition = 0;
			int endPosition = arr.length;
			int position;
			while (endPosition > initialPosition) {
				position = (endPosition - initialPosition) / 2;
				position += initialPosition;
				
				if (arr[position] == i) {
					return position;
				}
				
				if(arr[position] < i){
					initialPosition = position + 1;
				}else{
					endPosition = position;
				}
			}
		}
		return -1;
	}
	
	public int chopRecursive(int i, int[] arr){
		if (arr != null && arr.length > 0) {
			int[] arrDest;
			int initialPosition = 0;
			int endPosition = arr.length-1;
			int position;
			if (endPosition >= initialPosition) {
				position = (endPosition - initialPosition) / 2;
				position += initialPosition;
				
				if (arr[position] == i) {
					return position;
				}
				
				if(arr[position] < i){
					initialPosition = position + 1;
					arrDest =new int[endPosition-initialPosition+1];
					System.arraycopy(arr, initialPosition, arrDest, 0, endPosition-initialPosition+1);
				}else{
					endPosition = position;
					arrDest =new int[endPosition-initialPosition];
					System.arraycopy(arr, initialPosition, arrDest, 0, endPosition-initialPosition);
				}
								
				
				int returnValue = chopRecursive(i, arrDest);				
				return returnValue == -1 ? -1 : initialPosition + returnValue;
			}
		}
		return -1;
	}
}
