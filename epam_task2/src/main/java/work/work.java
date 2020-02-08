package work;
import Sweets.*;
import java.io.*;
import java.util.*;

public class work {
	private List<AllSweets> list = new ArrayList<AllSweets>();

	public List<AllSweets> getList() {
		return list;
	}

	

	public void add(AllSweets absCandy, int count) {
		for (AllSweets candy : getList()) {
			if (candy.getName().equals(absCandy.getName())) {
				candy.setCount(candy.getCount() + count);
				return;
			}
		}
		getList().add(absCandy);
		absCandy.setCount(count);
	}

	
	public int calculateTotalWeight() {
		int value = 0;
		for (AllSweets candy : getList()) {
			value += candy.getCount() * candy.getWeight();
		}
		return value;
	}

	public void getAllCandy() {
		for (AllSweets candy : getList()) {
			System.out.print(candy.printAllValues());
		}
	}

	     
	

	public List<AllSweets> receiveBySugarValue(int start, int end) {
		ArrayList<AllSweets> list2 = new ArrayList<AllSweets>();
		sortBySugarValue(list2);
		for (AllSweets candy : getList()) {
			if (start <= candy.getSugarValue() && candy.getSugarValue() < end) {
				list2.add(candy);
			}
		}
		return list2;
	}

	
	public void sortBySugarValue(List<AllSweets> list) {
		Collections.sort(list, new CompareBySugarValue());
	}

	static class CompareBySugarValue implements Comparator<AllSweets>,
			Serializable {

		private static final long serialVersionUID = -6923839843945617223L;

		public int compare(AllSweets o1, AllSweets o2) {
			return o1.getSugarValue() - o2.getSugarValue();
		}

	}
}