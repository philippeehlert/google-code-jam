import java.util.*;
import java.io.*;

public class StoreCredit {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int numberOfTests = in.nextInt();
		
		for (int i = 1; i <= numberOfTests; ++i) {
			int credit = in.nextInt();
			int numberOfItems = in.nextInt();
			int[] items = new int[numberOfItems];
			
			int itemCount = 0;
			while(itemCount < numberOfItems){
				items[itemCount++] = in.nextInt();
			}

			boolean found = false;

			for(int firstItem = 0; firstItem < items.length; firstItem++){
				for(int secondItem = 0; secondItem < items.length; secondItem++){
					if(firstItem == secondItem) break;

					int firstItemValue = items[firstItem];
					int secondItemValue = items[secondItem];

					int totalValue = firstItemValue + secondItemValue;
					if(totalValue == credit){
						if(firstItem > secondItem){
							System.out.println("Case #" + i + ": " + (secondItem+1) + " " + (firstItem+1));	
						} else{
							System.out.println("Case #" + i + ": " + (firstItem+1) + " " + (secondItem+1));	
						} 
						found = true;
						break;
					}
				}
				if(found) break;
			}

		}
	}
}
