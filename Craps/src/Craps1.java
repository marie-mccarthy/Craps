import java.util.Scanner;

public class Craps1
	{
		static int point;
		static int sum2;
		static int bet;
		static String name;
		static int dollars=100;
		static int moreMoney= dollars+bet;
		static int lessMoney= dollars-bet;
		static boolean stillPlaying =true;
		public static void main(String[] args)
		{
			getName();
			createBetting();
			rollPoint();
	//		playGame();
		}	
			public static String getName()
			{
				System.out.println("What is your name?");	
				Scanner userInput= new Scanner(System.in);
				String name = userInput.nextLine();
				return name;
			}			
			public static int createBetting()
			{
				System.out.println("Alright "+name+". You have 100 dollars. How much would you like to bet?");
				Scanner userInput2= new Scanner(System.in);
				int bet = userInput2.nextInt();	
				int dollars =100; 		
				return bet;
			}
			public static int rollPoint()
			{
				int dice1= (int)(Math.random()*6)+1;
				int dice2= (int)(Math.random()*6)+1;
				int point=dice1+dice2;
				System.out.println("Your numbers were "+dice1+" and "+dice2+". The point is "+point);
				return point;
			}
			public static int playGame;
				{
					if(point==2||point==12)
						{
							System.out.println("You loose "+name+". You have "+lessMoney+" dollars.");
							stillPlaying=false;
						}
					if (point==7||point==11)
						{
							
							System.out.println("You win! "+name+" You have "+moreMoney+" dollars");
							stillPlaying=false;
						}		
					while(stillPlaying)
						{		
				
							System.out.println("Alright "+name+".Press enter to reroll. ");				
							int dice3= (int)(Math.random()*6)+1;
							int dice4= (int)(Math.random()*6)+1;
							System.out.println("Your numbers were "+dice3+" and "+dice4);
							int sum2=dice3+dice4;

							System.out.println("The point is "+point+" "+name+". You still have "+dollars+" dollars.");		
							if(sum2==7)
								{

									System.out.println("You rolled a 7 "+name+"You loose. You have "+lessMoney+" dollars.");
									stillPlaying=false;
								}
							if (sum2==point)
								{
									
									System.out.println("You got the point "+name+". You win! "+moreMoney+" dollars.");
									stillPlaying=false;
								}
							
						}
				}	
	}

