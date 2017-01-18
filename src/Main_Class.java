import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Main_Class {
	public static void main(String[] args){
		
		//Declare your hand.
		Scanner hand = new Scanner(System.in);
		System.out.println("Enter your hand:");
		String your_hand = hand.next();
		System.out.println(your_hand + " is your hand \n");
		
        //Initiate combo's in HashMap
		HashMap<String, Integer> combos = new HashMap<String, Integer>();
		combos.put("A", 4);
		combos.put("K", 4);
		combos.put("Q", 4);
		combos.put("J", 4);
		combos.put("T", 4);
		combos.put("9", 4);
		combos.put("8", 4);
		combos.put("7", 4);
		combos.put("6", 4);
		combos.put("5", 4);
		combos.put("4", 4);
		combos.put("3", 4);
		combos.put("2", 4);
		
		char card_1_yours = your_hand.charAt(0);
		char card_2_yours = your_hand.charAt(1);
		
		switch (card_1_yours){
		case 'A': combos.put("A", combos.get("A") - 1);
		break;
		case 'K': combos.put("K", combos.get("K") - 1);
		break;
		case 'Q': combos.put("Q", combos.get("Q") - 1);
		break;
		case 'J': combos.put("J", combos.get("J") - 1);
		break;
		case 'T': combos.put("T", combos.get("T") - 1);
		break;
		case '9': combos.put("9", combos.get("9") - 1);
		break;
		case '8': combos.put("8", combos.get("8") - 1);
		break;
		case '7': combos.put("7", combos.get("7") - 1);
		break;
		case '6': combos.put("6", combos.get("6") - 1);
		break;
		case '5': combos.put("5", combos.get("5") - 1);
		break;
		case '4': combos.put("4", combos.get("4") - 1);
		break;
		case '3': combos.put("3", combos.get("3") - 1);
		break;
		case '2': combos.put("2", combos.get("2") - 1);
		break;
		default: System.out.println("Your hand consist of a card which cannot be a legitimate card");
		}
		
		switch (card_2_yours){
		case 'A': combos.put("A", combos.get("A") - 1);
		break;
		case 'K': combos.put("K", combos.get("K") - 1);
		break;
		case 'Q': combos.put("Q", combos.get("Q") - 1);
		break;
		case 'J': combos.put("J", combos.get("J") - 1);
		break;
		case 'T': combos.put("T", combos.get("T") - 1);
		break;
		case '9': combos.put("9", combos.get("9") - 1);
		break;
		case '8': combos.put("8", combos.get("8") - 1);
		break;
		case '7': combos.put("7", combos.get("7") - 1);
		break;
		case '6': combos.put("6", combos.get("6") - 1);
		break;
		case '5': combos.put("5", combos.get("5") - 1);
		break;
		case '4': combos.put("4", combos.get("4") - 1);
		break;
		case '3': combos.put("3", combos.get("3") - 1);
		break;
		case '2': combos.put("2", combos.get("2") - 1);
		break;
		default: System.out.println("Your hand consist of a card which cannot be a legitimate card");
		}
		
		//Declare the variable number_opponents.
		Scanner opp = new Scanner(System.in);
		System.out.println("Enter the number of opponents behind you (from 0 to 8):");
		int number_opponents = opp.nextInt();
		if (number_opponents <= 8 && number_opponents >= 0){
			System.out.println(number_opponents + " opponents are behind you \n");
		}else{number_opponents = 0;
		      System.out.println("Not a legitimate number, so number_opponents will be " + number_opponents);}
		      
		//Declare an array with all possible hands.
	    String[] array_all_hands = new String[91];
	    
					array_all_hands[0] = "AA";
					array_all_hands[1] = "KK";
					array_all_hands[2] = "QQ";
					array_all_hands[3] = "JJ";
					array_all_hands[4] = "TT";
					array_all_hands[5] = "99";
					array_all_hands[6] = "88";
					array_all_hands[7] = "77";
					array_all_hands[8] = "66";
					array_all_hands[9] = "55";
					array_all_hands[10] = "44";
					array_all_hands[11] = "33";
					array_all_hands[12] = "22";
					array_all_hands[13] = "AK";
					array_all_hands[14] = "AQ";
					array_all_hands[15] = "AJ";
					array_all_hands[16] = "AT";
					array_all_hands[17] = "A9";
					array_all_hands[18] = "A8";
					array_all_hands[19] = "A7";
					array_all_hands[20] = "A6";
					array_all_hands[21] = "A5";
					array_all_hands[22] = "A4";
					array_all_hands[23] = "A3";
					array_all_hands[24] = "A2";
					array_all_hands[25] = "KQ";
					array_all_hands[26] = "KJ";
					array_all_hands[27] = "KT";
					array_all_hands[28] = "K9";
					array_all_hands[29] = "K8";
					array_all_hands[30] = "K7";
					array_all_hands[31] = "K6";
					array_all_hands[32] = "K5";
					array_all_hands[33] = "K4";
					array_all_hands[34] = "K3";
					array_all_hands[35] = "K2";
					array_all_hands[36] = "QJ";
					array_all_hands[37] = "QT";
					array_all_hands[38] = "Q9";
					array_all_hands[39] = "Q8";
					array_all_hands[40] = "Q7";
					array_all_hands[41] = "Q6";
					array_all_hands[42] = "Q5";
					array_all_hands[43] = "Q4";
					array_all_hands[44] = "Q3";
					array_all_hands[45] = "Q2";
					array_all_hands[46] = "JT";
					array_all_hands[47] = "J9";
					array_all_hands[48] = "J8";
					array_all_hands[49] = "J7";
					array_all_hands[50] = "J6";
					array_all_hands[51] = "J5";
					array_all_hands[52] = "J4";
					array_all_hands[53] = "J3";
					array_all_hands[54] = "J2";
					array_all_hands[55] = "T9";
					array_all_hands[56] = "T8";
					array_all_hands[57] = "T7";
					array_all_hands[58] = "T6";
					array_all_hands[59] = "T5";
					array_all_hands[60] = "T4";
					array_all_hands[61] = "T3";
					array_all_hands[62] = "T2";
					array_all_hands[63] = "98";
					array_all_hands[64] = "97";
					array_all_hands[65] = "96";
					array_all_hands[66] = "95";
					array_all_hands[67] = "94";
					array_all_hands[68] = "93";
					array_all_hands[69] = "92";
					array_all_hands[70] = "87";
					array_all_hands[71] = "86";
					array_all_hands[72] = "85";
					array_all_hands[73] = "84";
					array_all_hands[74] = "83";
					array_all_hands[75] = "82";
					array_all_hands[76] = "76";
					array_all_hands[77] = "75";
					array_all_hands[78] = "74";
					array_all_hands[79] = "73";
					array_all_hands[80] = "72";
					array_all_hands[81] = "65";
					array_all_hands[82] = "64";
					array_all_hands[83] = "63";
					array_all_hands[84] = "62";
					array_all_hands[85] = "54";
					array_all_hands[86] = "53";
					array_all_hands[87] = "52";
					array_all_hands[88] = "43";
					array_all_hands[89] = "42";
					array_all_hands[90] = "32";
								
		            System.out.println("All possible hands are: " + "\n" + Arrays.toString(array_all_hands) + "\n");
					
		            
		            
//---------------------------------------------------------------------------------------------------------------------		            
		            
		            
		
		//Declare ranges R1, R2, R3 etc. depending on the number of opponents after you.
		if (number_opponents == 1){
			//Declare R1. Asks String input and type the input like this "AA KK QQ JJ TT 99 88".
			System.out.println("Enter the range of opponent 1:");
			Scanner R1_input = new Scanner(System.in);
			String R1_string = R1_input.nextLine();
			String[] R1_range = R1_string.split(" ");
			System.out.println(Arrays.toString(R1_range) + " is the range of R1 \n");
			
			//Declare another array with true/false values of having the range of R1
			Boolean[] array_check_R1 = new Boolean[91];
			for(int j=0; j<array_check_R1.length; j++){
				for(int k=0; k<R1_range.length; k++){
					if (array_all_hands[j].equals(R1_range[k])){
						array_check_R1[j] = true;
						break;
					}else array_check_R1[j] = false;
				}
			}
			System.out.println("R1 check: " + "\n" + Arrays.toString(array_check_R1) + "\n");
			
			float calc;
			//Calculate the chance numbers of having the opponent getting that certain hand
			float[] array_chances = new float[91];
			for(int l=0; l<array_all_hands.length; l++){
				//initiate card combo's again
				int A = combos.get("A"); int K = combos.get("K"); int Q = combos.get("Q"); int J = combos.get("J"); int T = combos.get("T"); int NINE = combos.get("9"); int EIGHT = combos.get("8"); int SEVEN = combos.get("7"); int SIX = combos.get("6"); int FIVE = combos.get("5"); int FOUR = combos.get("4"); int THREE = combos.get("3"); int TWO = combos.get("2");
				char card_1 = array_all_hands[l].charAt(0);
				switch (card_1){
				case 'A': calc = A;
					      A--;
				          break;
				case 'K': calc = K;
					      K--;
				          break;
				case 'Q': calc = Q;
					      Q--;
				          break;
				case 'J': calc = J;
					      J--;
				          break;
				case 'T': calc = T;
					      T--;
				          break;
				case '9': calc = NINE;
					      NINE--;
				          break;
				case '8': calc = EIGHT;
					      EIGHT--;
				          break;
				case '7': calc = SEVEN;
					      SEVEN--;
				          break;
				case '6': calc = SIX;
					      SIX--;
				          break;
				case '5': calc = FIVE;
					      FIVE--;
				          break;
				case '4': calc = FOUR;
					      FOUR--;
				          break;
				case '3': calc = THREE;
					      THREE--;
				          break;
				case '2': calc = TWO;
					      TWO--;
				          break;
				default:  calc = 0;
				}
				
				char card_2 = array_all_hands[l].charAt(1);
				switch (card_2){
				case 'A': calc = calc*A;
					      A--;
				          break;
				case 'K': calc = calc*K;
					      K--;
				          break;
				case 'Q': calc = calc*Q;
					      Q--;
				          break;
				case 'J': calc = calc*J;
					      J--;
				          break;
				case 'T': calc = calc*T;
					      T--;
				          break;
				case '9': calc = calc*NINE;
					      NINE--;
				          break;
				case '8': calc = calc*EIGHT;
					      EIGHT--;
				          break;
				case '7': calc = calc*SEVEN;
					      SEVEN--;
				          break;
				case '6': calc = calc*SIX;
					      SIX--;
				          break;
				case '5': calc = calc*FIVE;
					      FIVE--;
				          break;
				case '4': calc = calc*FOUR;
					      FOUR--;
				          break;
				case '3': calc = calc*THREE;
					      THREE--;
				          break;
				case '2': calc = calc*TWO;
					      TWO--;
				          break;
				default:  calc = 0;
				}
				
				if (card_1 == card_2){
					calc = calc*2;
				}
				
				array_chances[l] = calc/(50*49);
			}
			System.out.println("chances check: " + "\n" + Arrays.toString(array_chances) + "\n");
			
			//Only add the calculations of the range
			float[] array_chances_R1 = new float[91];
			for(int m = 0; m<array_chances_R1.length; m++){
				if (array_check_R1[m] == true){
					array_chances_R1[m] = array_chances[m];
				}else array_chances_R1[m] = 0;
			}
			System.out.println("chances check of R1: " + "\n" + Arrays.toString(array_chances_R1) + "\n");			
			
			float ANSWER = 0;
			for(int n=0; n<array_chances_R1.length; n++){
				ANSWER += array_chances_R1[n];
			}
			System.out.println("The answer is " +ANSWER + ", which is " +ANSWER*100+ "% \n");			
			
			//Create a text file of the matrix with the outcomes
			createFile table = new createFile();
			table.openFile("poker_matrix");
			
			for(int i=0; i<array_all_hands.length; i++){
			table.addRecords(array_all_hands[i], array_chances[i], array_check_R1[i], array_chances_R1[i]);
			};
			
			table.closeFile();
		}
		
		if (number_opponents == 2){
			
		//Declare R1. Asks String input and type the input like this "AA KK QQ JJ TT 99 88".
		System.out.println("Enter the range of opponent 1:");
		Scanner R1_input = new Scanner(System.in);
		String R1_string = R1_input.nextLine();
		String[] R1_range = R1_string.split(" ");
		System.out.println(Arrays.toString(R1_range) + " is the range of R1 \n");
			
		//Declare R2. Asks String input and type the input like this "AA KK QQ JJ TT 99 88".
		System.out.println("Enter the range of opponent 2:");
		Scanner R2_input = new Scanner(System.in);
		String R2_string = R2_input.nextLine();
		String[] R2_range = R2_string.split(" ");
		System.out.println(Arrays.toString(R2_range) + " is the range of R2 \n");
		
		//Build 91^2 array with all possibilities that 2 opponents can have
		String[] opp_2_all_hands_1 = new String[8281];
		String[] opp_2_all_hands_2 = new String[8281];
		for(int w=0; w<array_all_hands.length; w++){
			for(int z=0; z<array_all_hands.length; z++){
				opp_2_all_hands_1[z+w] = array_all_hands[z];
				opp_2_all_hands_2[z+w] = array_all_hands[w];
			}
		}
		
		//Declare another array with true/false values of having the range of R1
		Boolean[] array_check_R1_R2 = new Boolean[8281];
		for(int j=0; j<array_check_R1_R2.length; j++){
			for(int k=0; k<R1_range.length; k++){
				if (opp_2_all_hands_1[j] == R1_range[k] || opp_2_all_hands_2[j] == R2_range[k]){
					array_check_R1_R2[j] = true;
					break;
				}else array_check_R1_R2[j] = false;
			}
		}
		System.out.println("R1+R2 check: " + "\n" + Arrays.toString(array_check_R1_R2) + "\n");
		
		float calc;
		//Calculate the chance numbers of having the opponent getting that certain hand
		float[] array_chances = new float[91*91];
		for(int l=0; l<opp_2_all_hands_1.length; l++){
			//initiate card combo's again
			int A = combos.get("A"); int K = combos.get("K"); int Q = combos.get("Q"); int J = combos.get("J"); int T = combos.get("T"); int NINE = combos.get("9"); int EIGHT = combos.get("8"); int SEVEN = combos.get("7"); int SIX = combos.get("6"); int FIVE = combos.get("5"); int FOUR = combos.get("4"); int THREE = combos.get("3"); int TWO = combos.get("2");
			char card_1 = opp_2_all_hands_1[l].charAt(0);
			switch (card_1){
			case 'A': calc = A;
				      A--;
			          break;
			case 'K': calc = K;
				      K--;
			          break;
			case 'Q': calc = Q;
				      Q--;
			          break;
			case 'J': calc = J;
				      J--;
			          break;
			case 'T': calc = T;
				      T--;
			          break;
			case '9': calc = NINE;
				      NINE--;
			          break;
			case '8': calc = EIGHT;
				      EIGHT--;
			          break;
			case '7': calc = SEVEN;
				      SEVEN--;
			          break;
			case '6': calc = SIX;
				      SIX--;
			          break;
			case '5': calc = FIVE;
				      FIVE--;
			          break;
			case '4': calc = FOUR;
				      FOUR--;
			          break;
			case '3': calc = THREE;
				      THREE--;
			          break;
			case '2': calc = TWO;
				      TWO--;
			          break;
			default:  calc = 0;
			}
			
			char card_2 = opp_2_all_hands_1[l].charAt(1);
			switch (card_2){
			case 'A': calc = calc*A;
				      A--;
			          break;
			case 'K': calc = calc*K;
				      K--;
			          break;
			case 'Q': calc = calc*Q;
				      Q--;
			          break;
			case 'J': calc = calc*J;
				      J--;
			          break;
			case 'T': calc = calc*T;
				      T--;
			          break;
			case '9': calc = calc*NINE;
				      NINE--;
			          break;
			case '8': calc = calc*EIGHT;
				      EIGHT--;
			          break;
			case '7': calc = calc*SEVEN;
				      SEVEN--;
			          break;
			case '6': calc = calc*SIX;
				      SIX--;
			          break;
			case '5': calc = calc*FIVE;
				      FIVE--;
			          break;
			case '4': calc = calc*FOUR;
				      FOUR--;
			          break;
			case '3': calc = calc*THREE;
				      THREE--;
			          break;
			case '2': calc = calc*TWO;
				      TWO--;
			          break;
			default:  calc = 0;
			}
			
			if (card_1 == card_2){
				calc = calc*2;
			}
			
			char card_3 = opp_2_all_hands_2[l].charAt(0);
			switch (card_3){
			case 'A': calc = calc*A;
				      A--;
			          break;
			case 'K': calc = calc*K;
				      K--;
			          break;
			case 'Q': calc = calc*Q;
				      Q--;
			          break;
			case 'J': calc = calc*J;
				      J--;
			          break;
			case 'T': calc = calc*T;
				      T--;
			          break;
			case '9': calc = calc*NINE;
				      NINE--;
			          break;
			case '8': calc = calc*EIGHT;
				      EIGHT--;
			          break;
			case '7': calc = calc*SEVEN;
				      SEVEN--;
			          break;
			case '6': calc = calc*SIX;
				      SIX--;
			          break;
			case '5': calc = calc*FIVE;
				      FIVE--;
			          break;
			case '4': calc = calc*FOUR;
				      FOUR--;
			          break;
			case '3': calc = calc*THREE;
				      THREE--;
			          break;
			case '2': calc = calc*TWO;
				      TWO--;
			          break;
			default:  calc = 0;
			}
			
			char card_4 = opp_2_all_hands_2[l].charAt(1);
			switch (card_4){
			case 'A': calc = calc*A;
				      A--;
			          break;
			case 'K': calc = calc*K;
				      K--;
			          break;
			case 'Q': calc = calc*Q;
				      Q--;
			          break;
			case 'J': calc = calc*J;
				      J--;
			          break;
			case 'T': calc = calc*T;
				      T--;
			          break;
			case '9': calc = calc*NINE;
				      NINE--;
			          break;
			case '8': calc = calc*EIGHT;
				      EIGHT--;
			          break;
			case '7': calc = calc*SEVEN;
				      SEVEN--;
			          break;
			case '6': calc = calc*SIX;
				      SIX--;
			          break;
			case '5': calc = calc*FIVE;
				      FIVE--;
			          break;
			case '4': calc = calc*FOUR;
				      FOUR--;
			          break;
			case '3': calc = calc*THREE;
				      THREE--;
			          break;
			case '2': calc = calc*TWO;
				      TWO--;
			          break;
			default:  calc = 0;
			}
			
			if (card_1 == card_2){
				calc = calc*2;
			}
			
			array_chances[l] = calc/(50*49*48*47);
		}
		System.out.println("chances check: " + "\n" + Arrays.toString(array_chances) + "\n");
		
		//Only add the calculations of the range
		float[] array_chances_R1_R2 = new float[91*91];
		for(int m = 0; m<array_chances_R1_R2.length; m++){
			if (array_check_R1_R2[m] == true){
				array_chances[m] = array_chances_R1_R2[m];
			}else array_chances[m] = 0;
		}
		System.out.println("chances check of R1: " + "\n" + Arrays.toString(array_chances_R1_R2) + "\n");			
		
		float ANSWER = 0;
		for(int n=0; n<array_chances.length; n++){
			ANSWER += array_chances[n];
		}
		System.out.println("The answer is " +ANSWER + ", which is " +ANSWER*100+ "% \n");			
		
		//Create a text file of the matrix with the outcomes
		createFile table = new createFile();
		table.openFile("poker_matrix");
		
		for(int i=0; i<array_all_hands.length; i++){
		table.addRecords(array_all_hands[i], array_chances[i], array_check_R1_R2[i], array_chances_R1_R2[i]);
		};
		
		table.closeFile();
		}
		
		if (number_opponents >= 3){
		//Declare R3. Asks String input and type the input like this "AA KK QQ JJ TT 99 88".
		System.out.println("Enter the range of opponent 3:");
		Scanner R3_input = new Scanner(System.in);
		String R3_string = R3_input.nextLine();
		String[] R3_range = R3_string.split(" ");
		System.out.println(Arrays.toString(R3_range) + " is the range of R3 \n");
		}
		
		if (number_opponents >= 4){
		//Declare R4. Asks String input and type the input like this "AA KK QQ JJ TT 99 88".
		System.out.println("Enter the range of opponent 4:");
		Scanner R4_input = new Scanner(System.in);
		String R4_string = R4_input.nextLine();
		String[] R4_range = R4_string.split(" ");
		System.out.println(Arrays.toString(R4_range) + " is the range of R4 \n");
		}
		
		if (number_opponents >= 5){
		//Declare R1. Asks String input and type the input like this "AA KK QQ JJ TT 99 88".
		System.out.println("Enter the range of opponent 5:");
		Scanner R5_input = new Scanner(System.in);
		String R5_string = R5_input.nextLine();
		String[] R5_range = R5_string.split(" ");
		System.out.println(Arrays.toString(R5_range) + " is the range of R5 \n");
		}
		
		if (number_opponents >= 6){
		//Declare R6. Asks String input and type the input like this "AA KK QQ JJ TT 99 88".
		System.out.println("Enter the range of opponent 6:");
		Scanner R6_input = new Scanner(System.in);
		String R6_string = R6_input.nextLine();
		String[] R6_range = R6_string.split(" ");
		System.out.println(Arrays.toString(R6_range) + " is the range of R6 \n");
		}
		
		if (number_opponents >= 7){
		//Declare R7. Asks String input and type the input like this "AA KK QQ JJ TT 99 88".
		System.out.println("Enter the range of opponent 7:");
		Scanner R7_input = new Scanner(System.in);
		String R7_string = R7_input.nextLine();
		String[] R7_range = R7_string.split(" ");
		System.out.println(Arrays.toString(R7_range) + " is the range of R7 \n");
		}
		
		if (number_opponents == 8){
		//Declare R8. Asks String input and type the input like this "AA KK QQ JJ TT 99 88".
		System.out.println("Enter the range of opponent 8:");
		Scanner R8_input = new Scanner(System.in);
		String R8_string = R8_input.nextLine();
		String[] R8_range = R8_string.split(" ");
		System.out.println(Arrays.toString(R8_range) + " is the range of R8 \n");
		}		
	}	
}