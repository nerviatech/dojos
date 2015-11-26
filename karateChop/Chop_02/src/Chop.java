
public class Chop {

	
	public int chop(int search, int[] values) {
		
		if (values == null || values.length <= 0) return -1;
		
		int mitad = (int) Math.floor(values.length/2);
		
		// comprobar si coincide con la mitad
		if (values[mitad] == search) {
			//TODO devolver indice
			return mitad;
		} 
		// comprobar si tenemos suficiente espacio para seguir
		if (values.length == 1) {
			return -1;
		}
		// si el valor es superior al medio
		if (values[mitad] < search) {
			int[] newValues = new int[values.length-(mitad+1)];
			System.arraycopy(values, mitad+1, newValues, 0, values.length-(mitad+1));
			int result = chop(search, newValues);
			return result == -1 ? result : result + mitad + 1;
		}
		
		// si el valor es inferior al medio
		int[] newValues = new int[mitad];
		System.arraycopy(values, 0, newValues, 0, mitad);
		return chop(search, newValues);
	}
	
}

