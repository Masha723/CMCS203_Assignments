import java.util.Random;
import java.util.Scanner;

public class ESPGame {
	public static void main(String[] args) {
		
		String name,description,color;
		int CPU_number,color_number=0,count=0;
		boolean input_check=true;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		name=sc.nextLine();
		System.out.print("Describe yourself: ");
		description=sc.nextLine();
		System.out.print("Due Date: 02/05/2024\nCMSC203 Assignment1: Test your ESP skills!\n");
		
		for (int i=1;i<12;i++) {
			System.out.println("Round " +i+"\n");
			System.out.println("I am thinking of a color.\nIs it Red, Green, Blue, Orange, or Yellow?\nEnter your guess:\n");
			color=sc.nextLine();
			switch(color) {
				case "red":
				case "Red":
					color_number=0;
					break;
				case "Green":
				case "green":
					color_number=1;
					break;
				case "Blue":
				case "blue":
					color_number=2;
					break;
				case "Orange":
				case "orange":
					color_number=3;
					break;
				case "Yellow":
				case "yellow":
					color_number=4;
					break;
				default:
					input_check=false;
					break;
					}
			while (input_check==false){
				System.out.println("You entered incorrect color. Is it\nRed, Green, Blue, Orange, or Yellow?\nEnter your guess again:");
				color=sc.nextLine();
				switch(color) {
				case "red":
				case "Red":
					color_number=0;
					input_check=true;
					break;
				case "Green":
				case "green":
					color_number=1;
					input_check=true;
					break;
				case "Blue":
				case "blue":
					color_number=2;
					input_check=true;
					break;
				case "Orange":
				case "orange":
					color_number=3;
					input_check=true;
					break;
				case "Yellow":
				case "yellow":
					color_number=4;
					input_check=true;
					break;
				default:
					input_check=false;
					break;
					}
			}
			Random rand= new Random();
			CPU_number=rand.nextInt(5);
			if (CPU_number==color_number) {
				count+=1;
				}
			switch(CPU_number){
				case 0:
					System.out.println("I was thinking of Red.");
					break;
				case 1:
					System.out.println("I was thinking of Geen.");
					break;
				case 2:
					System.out.println("I was thinking of Blue.");
					break;
				case 3:
					System.out.println("I was thinking of Orange.");
					break;
				case 4:
					System.out.println("I was thinking of Yellow.");
					break;
					}
		}
		//end of of rounds loop
		System.out.println("\nGame Over\n");
		System.out.println("You guessed "+count+" out of 11 colors correctly.");
		System.out.println("Student’s Name: "+name);
		System.out.println("User Description: "+description);
		System.out.println("Due Date: 02/05/2024");
		}

}
