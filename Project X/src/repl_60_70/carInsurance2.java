package repl_60_70;

import java.util.*;

public class carInsurance2 {
  public static void main(String[] args) {
    //DO NOT CHANGE
    double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
    //WRITE YOUR CODE HERE
		
		int zipCode;
		System.out.println("Enter your name");
				name = scan.nextLine();
				
				System.out.println("Do you have a US driver license?");
				String license = scan.nextLine();
				if (license.equalsIgnoreCase("no")) {
				System.out.println("Invalid data!");
				System.exit(0);}
				
				System.out.println("Enter your zip code");
				zipCode = scan.nextInt();
				if((zipCode == 20910) && (zipCode == 20740))
				premium+=60;
				else if((zipCode == 22102) && (zipCode == 22103))
				premium+=30;
				else
				premium+=50;
				
				System.out.println("Is this vehicle Owned, Financed, or Leased?");
				vehicleOwnership=scan.next();
				if (vehicleOwnership.equalsIgnoreCase("owned"))
				premium+=10;	
				else
				premium+=20;
				
				System.out.println("How is this vehicle primarily used?");
                String usage = scan.next();
                
                if(usage.equalsIgnoreCase("commute")) 
                {
                   premium+=20;
                System.out.println("Days Driven To Work And/Or School");
                
                daysDrivenToWorkOrSchool=scan.nextInt();
                
                System.out.println("Miles Driven To Work And/Or School");
				        milesToWorkOrSchool=scan.nextInt();
				        premium+=milesToWorkOrSchool; 
				        
                if(daysDrivenToWorkOrSchool == 5 ) {
                    premium+=25;
                }else if(daysDrivenToWorkOrSchool == 4 ) 
                    premium+=20;
                else if(daysDrivenToWorkOrSchool == 3 ) 
                    premium+=15;
                else if(daysDrivenToWorkOrSchool == 2 ) 
                    premium+=10;
                else if(daysDrivenToWorkOrSchool == 2 ) 
                    premium+=5;
                else 
                    premium+=0;
                
                }
                
				
				
                if(usage.equalsIgnoreCase("business")) {
                    premium+=50;
                }else if(usage.equalsIgnoreCase("pleasure")){
                    premium+=50;
                }
                
				
	
				
				System.out.println("How old are you?");
				   int age= scan.nextInt();
				   if(age<16)   {  System.out.println("Invalid data!");
				   System.exit(0);}
				   else if(age>16 && age<18)   { premium = premium*20; }
				   else if(age>=18 && age<=21){ premium = premium*6; }  
				   else if(age>21 && age<25)    {  premium = premium*2; }  
				   
				   
				   
				   System.out.println("How many years you've been driving?");
				   int experincedYear = scan.nextInt();
				   boolean experience = (experincedYear==0 && experincedYear-age>=16);
				   if(experience =false){
						System.out.println("Invalid data!");
						System.exit(0);}
						premium = premium - (experincedYear*5);
				
				System.out.println("Have you had any accidents in the last 5 years?");
				String answer=scan.next();
				if(answer.equalsIgnoreCase("yes"))
				{System.out.println("How many?");
				accidentsAmount=scan.nextInt();
				premium+=(accidentsAmount*0.5);
				}
				
				
			
				
		System.out.println("Enter your name");
				name = scan.nextLine();
				
				System.out.println("Do you have a US driver license?");
				license = scan.nextLine();
				if (license.equalsIgnoreCase("no")) {
				System.out.println("Invalid data!");
				System.exit(0);}
				
				System.out.println("Enter your zip code");
				zipCode = scan.nextInt();
				if((zipCode == 20910) && (zipCode == 20740))
				premium+=60;
				else if((zipCode == 22102) && (zipCode == 22103))
				premium+=30;
				else
				premium+=50;
				
				System.out.println("Is this vehicle Owned, Financed, or Leased?");
				vehicleOwnership=scan.next();
				if (vehicleOwnership.equalsIgnoreCase("owned"))
				premium+=10;	
				else
				premium+=20;
				
				System.out.println("How is this vehicle primarily used?");
                usage = scan.next();
                
                if(usage.equalsIgnoreCase("commute")) 
                {
                   premium+=20;
                System.out.println("Days Driven To Work And/Or School");
                
                daysDrivenToWorkOrSchool=scan.nextInt();
                
                System.out.println("Miles Driven To Work And/Or School");
				        milesToWorkOrSchool=scan.nextInt();
				        premium+=milesToWorkOrSchool; 
				        
                if(daysDrivenToWorkOrSchool == 5 ) {
                    premium+=25;
                }else if(daysDrivenToWorkOrSchool == 4 ) 
                    premium+=20;
                else if(daysDrivenToWorkOrSchool == 3 ) 
                    premium+=15;
                else if(daysDrivenToWorkOrSchool == 2 ) 
                    premium+=10;
                else if(daysDrivenToWorkOrSchool == 2 ) 
                    premium+=5;
                else 
                    premium+=0;
                
                }
                
				
				
                if(usage.equalsIgnoreCase("business")) {
                    premium+=50;
                }else if(usage.equalsIgnoreCase("pleasure")){
                    premium+=50;
                }
                
				
	
				
				System.out.println("How old are you?");
				   age= scan.nextInt();
				   if(age<16)   {  System.out.println("Invalid data!");
				   System.exit(0);}
				   else if(age>16 && age<18)   { premium = premium*20; }
				   else if(age>=18 && age<=21){ premium = premium*6; }  
				   else if(age>21 && age<25)    {  premium = premium*2; }  
				   
				   
				   
				   System.out.println("How many years you've been driving?");
				   experincedYear = scan.nextInt();
				   experience = (experincedYear==0 && experincedYear-age>=16);
				   if(experience =false){
						System.out.println("Invalid data!");
						System.exit(0);}
						premium = premium - (experincedYear*5);
				
				System.out.println("Have you had any accidents in the last 5 years?");
				answer=scan.next();
				if(answer.equalsIgnoreCase("yes"))
				{System.out.println("How many?");
				accidentsAmount=scan.nextInt();
				premium+=(accidentsAmount*0.5);
				}
				
				
			
				System.out.println("Have you had continuous insurance for the past 12 months? ");
				continuousInsurance=scan.next();
				if (continuousInsurance.equalsIgnoreCase("no"))
				premium*=2;
				
				System.out.println("What is the highest level of education you have completed?");
				education = scan.next();
				if (education.equalsIgnoreCase("PhD" )){
					premium = premium-( premium*0.05);
				}else if (education.equalsIgnoreCase("Bachelors")){
					premium = premium-( premium*0.05);
				}else if (education.equalsIgnoreCase("Masters")){
					premium = premium-( premium*0.05);
				
				}else if (education.equalsIgnoreCase("Doctors" )){
					premium = premium-( premium*0.10);
					
				}else if (education.equalsIgnoreCase("Less than High School")){
					premium = premium+( premium*0.05);
				}else if(education.equalsIgnoreCase("Doctors")){premium=premium-(premium*0.10);

				}else if(education.equalsIgnoreCase("Less than High School")){premium=premium+(premium*0.05);}

				referenceNumber=(""+name.substring(0,2)+age+name.charAt(name.length()-1)+name.charAt(name.length()-2)+zipCode+education);System.out.println(name+", here's your quote! \nStart Your Policy Today For: $"+premium+"\nReference number: "+referenceNumber);

				
				
				
				referenceNumber =(""+ name.substring(0,2) + age + name.charAt(name.length()-1) + name.charAt(name.length()-2) +
						zipCode + education );
				 System.out.println(name +", here's your quote! \nStart Your Policy Today For: $"+premium 
						 			+"\nReference number: "+referenceNumber);  
				
			

				 System.out.println("Have you had continuous insurance for the past 12 months? ");continuousInsurance=scan.next();if(continuousInsurance.equalsIgnoreCase("no"))premium*=2;

				 System.out.println("What is the highest level of education you have completed?");education=scan.next();if(education.equalsIgnoreCase("PhD")){premium=premium-(premium*0.05);}else if(education.equalsIgnoreCase("Bachelors")){premium=premium-(premium*0.05);}else if(education.equalsIgnoreCase("Masters")){premium=premium-(premium*0.05);

				 }
  }
}

