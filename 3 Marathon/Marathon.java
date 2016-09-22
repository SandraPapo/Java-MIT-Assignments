import java.util.Vector;

class Marathon {
	public static void main (String[] arguments) {
		String[] names = {"Jurko", "Sandra", "Sandras Boob"
		};
	
		int[] times = {234, 240, 234
		};
		for (int i = 0; i < names.length; i++) {
 			System.out.println(names[i] + ": " + times[i]);
		}
		// Edge case: Array is empty
		if(times.length == 0)
			System.out.println("fuck off");		
		else {
			Vector<Integer> fastestIndexes = getFastest(times);
			//General case: This code works for all times.length > 0
			for (int i = 0; i < fastestIndexes.size(); i++)
			System.out.println("The fastest time is " + times[fastestIndexes.get(i)] + " ran by " + names[fastestIndexes.get(i)]);
		}
	}

	public static Vector<Integer> getFastest(int[] times){
		int lowest = times[0];
		int index = 0;
		for (int i = 0; i < times.length ; i++ ) {
			if (times[i] < lowest) {
				index  = i;
				lowest = times[i];
			}	
		}

		Vector<Integer> indexes = new Vector<Integer>();
		for(int i = 0; i < times.length ; i++){
			if(lowest == times[i])
				indexes.add(i);
		}
		return indexes;
	}
}
