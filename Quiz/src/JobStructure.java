
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//10:15 Feb. 3 Hopefully you're reading this on Wednesday and I'm sleeping at home during the snowday. 
public class JobStructure
	{
		static ArrayList<Job> JobInfo = new ArrayList<Job>();
		static Scanner userStringInput = new Scanner(System.in);
		static String input;

		public static void main(String[] args)
			{
				fillArray();
				intro();
				questionSeries();
				Final();

			}

		private static void fillArray()
			{
				JobInfo.add(new Job("Teacher", 0,         false, true,  false, true,  false, true,  true,  true,  false));
				JobInfo.add(new Job("Policeman", 0,       true,  true,  true,  true,  false, true,  false, false, true));
				JobInfo.add(new Job("Detective", 0,       false, true,  true,  true,  false, true,  true,  true,  false));
				JobInfo.add(new Job("Instagram Model", 0, false, false, true,  false, false, true,  false, false, false));
				JobInfo.add(new Job("Doctor", 0,          false, true,  true,  true,  true,  false, true,  false, true));
				JobInfo.add(new Job("Homeless Person", 0, false, false, false, false, false, false, false, false, false));
				JobInfo.add(new Job("President", 0,       true,  true,  true,  true,  true,  true,  true,  true,  true));
				JobInfo.add(new Job("Attorney", 0,        false, true,  false, true,  true,  true,  false, true,  false));
				JobInfo.add(new Job("Orthodontist", 0,    true,  true,  true,  false, true,  true,  false, true,  true));
				JobInfo.add(new Job("Cartographer", 0,    false, false, false, false, true,  false, true,  false, true));



			}
		

		private static void intro()
			{
				Scanner userStringInput = new Scanner(System.in);
				System.out.println("What's your name?");
				String name = userStringInput.nextLine();
				System.out.println("Hello " + name
						+ " ! Nice to meet you! I'm gonna ask you a few questions and at the end I'll tell you what job you're best fit for!");

				System.out.println("When you're finished with a question press the enter key!");
			}

		private static void questionSeries()
			{
				Questions.Q1();
				input = userStringInput.nextLine();
				input = input.toUpperCase();
				switch (input)
					{
					case "A":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getSocialSkills() == false)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 

										}

								}
							  
							break;
						}
					case "B":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getResponseToFailure() == false)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 

										}
								}
							break;


						}
					case "C":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getSocialSkills() == false)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 

										}

								}
							  
							break;

						}
					}
			
	
					
					

				Questions.Q2();
				input = userStringInput.nextLine();
				switch (input)
					{
					case "A":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getResponseToLeadership() == true)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 

										}

								}
							break;


						}
					case "B":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getResponseToFailure() == false)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 

										}

								}
							  
							break;

						}
					case "C":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getSocialSkills() == false)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 

										}

								}
							break;


						}
					}
				Questions.Q3();
				input = userStringInput.nextLine();
				switch (input)
					{
					case "A":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getTeamWork() == true)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 

										}
									  

								}
							break;

						}
					case "B":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getSocialSkills() == false)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 
										}
									  

								}
							break;

						}
					case "C":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getResponseToLeadership() == false)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 
										}
									  

								}
							break;

						}
					}
				Questions.Q4();
				input = userStringInput.nextLine();
				switch (input)
					{
					case "A":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getAttentionSpanTenacity() == true)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 

										}
									  

								}
							break;

						}
					case "B":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getSocialSkills() == true)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 

										}
									  

								}
							break;

						}
					case "C":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getAttentionSpanTenacity() == false)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 

										}
									  

								}
							break;

						}
					}
				Questions.Q5();
				input = userStringInput.nextLine();
				switch (input)
					{
					case "A":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getTeamWork() == false)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 

										}
									  

								}
							break;

						}
					case "B":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getTeamWork() == true)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 

										}
									  

								}
							break;

						}
					case "C":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getResponseToLeadership() == false)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 
										}
									  

								}

							break;
						}
					}
				Questions.Q6();
				input = userStringInput.nextLine();
				switch (input)
					{
					case "A":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getNumbers() == true)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 
										}
									  

								}
							break;
						}
					case "B":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getEngLit() == true)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 
										}
									  

								}
							break;
						}
					case "C":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getResponseToLeadership() == false)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 
										}
									  

								}

							break;
						}
					}
				Questions.Q7();
				input = userStringInput.nextLine();
				switch (input)
					{
					case "A":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getHands() == true)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 

										}
									  

								}
							break;
						}
					case "B":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getFastWorker() == true)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 
										}
									  

								}
							break;
						}
					case "C":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getAttentionSpanTenacity() == false)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 
										}
									  

								}

							break;
						}
					}
				Questions.Q8();
				input = userStringInput.nextLine();
				switch (input)
					{
					case "A":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getFastWorker() == true)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 
										}
									  

								}
						}
					case "B":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getTeamWork() == true)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 
										}
									  

								}
						}
					case "C":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getTeamWork() == false)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 
										}
									  

								}

						}
					}
				Questions.Q9();
				input = userStringInput.nextLine();
				
				switch (input)
					{
					case "A":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getFastWorker() == true)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 
										}
									  

								}
						}
					case "B":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getTeamWork() == true)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 
										}
									  

								}
						}
					case "C":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getHands() == true)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
 
 
										}
				


								}
							
						}
					}
				Questions.Q10();
				input = userStringInput.nextLine();
				switch (input)
					{
					case "A":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getTeamWork() == false)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
								
										}
				

								}

						}
					case "B":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getTeamWork() == true)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
	
										}
									  

								}
				
						}
					case "C":
						{
							for (int i = 0; i < JobInfo.size(); i++)
								{
									if (JobInfo.get(i).getAttentionSpanTenacity() == true)
										{
											JobInfo.get(i).setScore((JobInfo.get(i).getScore() + 1));
											
										}
									  

								}
			
							break;

						}
					
					}
					}
			

		
	private static void Final()
	{
		Collections.sort(JobInfo, new Sorter());
		System.out.println("You are going to be a " + JobInfo.get(0).getTitle()+"!");
	}
	
	}
