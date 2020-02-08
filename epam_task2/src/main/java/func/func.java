package func;
import Sweets.*;
import work.*;
public class func
{
	private static final int START = 25;
	private static final int END = 40;

	// Creating objects
	private static final mothichoor mothichoor1 = new mothichoor("mothichoor1", 10, 10);
	private static final mothichoor mothichoor2 = new mothichoor("mothichoor2", 15, 15);
	private static final mothichoor mothichoor3 = new mothichoor("mothichoor3", 25, 20);
	private static final peda peda1 = new peda("peda1", 10, 50);
	private static final peda peda2 = new peda("peda2", 20, 50);
	private static final rasgulla rasgulla1 = new rasgulla("rasgulla1", 20, 15);
	private static final rasgulla rasgulla2 = new rasgulla("rasgulla2", 30, 20);

	// Creating container
	private static final  work GIFT = new work();

	public static work getGift() {
		return GIFT;
	}



	public static void createGift() {
		getGift().add(rasgulla1, 6);
		getGift().add(rasgulla2, 8);
		getGift().add(rasgulla2, 7);
		getGift().add(peda1, 1);
		getGift().add(peda2, 1);
		getGift().add(mothichoor1, 3);
		getGift().add(mothichoor2, 4);
		getGift().add(mothichoor3, 5);
		getGift().add(peda1, 12);
		getGift().add(peda2, 17);
		getGift().add(rasgulla2, 14);
		getGift().add(peda1, 1);
		getGift().add(rasgulla2, 1);
		getGift().add(peda1, 3);
		getGift().add(rasgulla2, 1);
	}
    public static void main( String[] args )
    {
    	createGift();
		System.out.println("Getting all objects from the gift:");
		getGift().getAllCandy();
		System.out.println();
		System.out.println("Sorting objects by sugarValue:");
		getGift().sortBySugarValue(getGift().getList());
		getGift().getAllCandy();
		System.out.println();
		System.out.println("Calculating total weight of the gift: ");
		System.out.println(getGift().calculateTotalWeight() + " gm");
		System.out.println();
		System.out
				.println("Getting all objects with selected range of sugar value(from "
						+ START + "% to " + END + "%) :");
		for (AllSweets Sweets : getGift().receiveBySugarValue(START, END)) {
			System.out.print(Sweets.printAllValues());
		}
	}

}