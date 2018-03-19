package com.bridgeit.DesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {
	private static int choice;

	public static void main(String args[]) throws NumberFormatException, IOException {
		do {
			System.out.print("*** CAKE SHOP ***\n");
			System.out.print("  1. BLACKFOREST.\n");
			System.out.print("  2. MANGO MERINGUE.\n");
			System.out.print("  3. OREOCHEESE.\n");
                        System.out.print("  4. BANANA WITH CHEESE.\n");
                        System.out.print("  5. Exit.\n");
			System.out.print("Enter your choice : ");

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(bufferedReader.readLine());
			ShopKeeper shopKeeper= new ShopKeeper();

			switch (choice) {
			case 1: {
				shopKeeper.Blackforestsale();
			}
				break;
			case 2: {
				shopKeeper.MangoMeringue();
			}
				break;
                        case 3: {
                                shopKeeper.OreoCheese();
                                break;
                        }
                        case 4: {
                                shopKeeper.BanaWithCheese();
                                break;
                        }
                        case 5:System.exit(0);

			default: {
				System.out.println("Nothing You purchased");
			}
				return;
			}

		} while (choice != 4);
	}
}