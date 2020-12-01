package taxCal;

import java.util.Scanner;


public class userTax {
	public double [] belowsixty(int netsalary, int ded2)
	{
		double op[] = {0,0,0};
		double tax=0;
		

		int taxable=0;

		if(netsalary<250000)
		{
			
			System.out.print("NO NEED TO PAY TAX ");
		}
		else
		{
			

			
			netsalary=netsalary-ded2;
			
			if(netsalary<250000)
			{
				tax=0;
			
				
			}
			else if(netsalary>250000 && netsalary<=500000)
			{
				taxable = netsalary-250000;
				 tax = taxable*0.05;
				
				 
				
			}	
			else if(netsalary>500000 && netsalary<=1000000)
			{
				taxable=netsalary-500000;
				 tax= taxable*0.2;
				 tax=tax+12500;
				
			}
			else {
				
				taxable=netsalary-1000000;
				 tax= taxable*0.3;
				 tax=tax+112500;
			}
			
			
		}

		op[0] = netsalary;
		op[1] = tax;
		op[2] = tax*0.04;
		return op;
	}
	public double[] abovesixty(int netsalary, int ded2)
	{
		
		double op[] = {0,0,0};
		double tax=0;
		
//		System.out.print("Enter INCOME ");
//		int netsalary=sc.nextInt();
		int taxable=0;
//		double cess=0;
		if(netsalary<=300000)
		{
			
			System.out.print("NO NEED TO PAY TAX ");
			System.exit(0);
		}
		else
		{
			
//			System.out.print("Enter  Deductions ");
//			int ded2=sc.nextInt();
			netsalary=netsalary-ded2;
			
			if(netsalary<=300000)
			{
				tax=0;
			
				
			}
			else if(netsalary>300000 && netsalary<=500000)
			{
				taxable=netsalary-300000;
				 tax= taxable*0.05;
				
				 
				
			}	
			else if(netsalary>500000 && netsalary<=1000000)
			{
				taxable=netsalary-500000;
				 tax= taxable*0.2;
				 tax=tax+10000;
				
			}
			else {
				
				taxable=netsalary-1000000;
				 tax= taxable*0.3;
				 tax=tax+110000;
			}
//			sc.close();
			
			
		}
		op[0] = netsalary;
		op[1] = tax;
		op[2] = tax*0.04;
		return op;
	}
	public double [] aboveeight(int netsalary, int ded2) {
		
		double op[] = {0,0,0};
		double tax=0;
		
//		System.out.print("Enter INCOME ");
//		int netsalary=sc.nextInt();
		int taxable=0;
//		double cess=0;
		if(netsalary<=500000)
		{
			
			System.out.print("NO NEED TO PAY TAX ");
//			System.exit(0);
		}
		else
		{
			
//			System.out.print("Enter  Deductions ");
//			int ded2=sc.nextInt();
			netsalary=netsalary-ded2;
			
			if(netsalary<=500000)
			{
				tax=0;
			
				
			}
			else if(netsalary>500000 && netsalary<=1000000)
			{
				taxable=netsalary-500000;
				 tax= taxable*0.2;
				
				 
				
			}	
			
			else {
				
				taxable=netsalary-1000000;
				 tax= taxable*0.3;
				 tax=tax+100000;
			}
			
//		sc.close();	
		}
		op[0] = netsalary;
		op[1] = tax;
		op[2] = tax*0.04;
		return op;
//		System.out.print("Taxable income is  "+netsalary);
//		System.out.print("\nTax is   "+tax);
//		System.out.print("\nEductional Cess  is   "+tax*0.04);
	}
	
	public  double[] tax(int age, int netsalary, int deb2)
	{
		userTax s = new userTax();
//		System.out.printf("ENTER AGE");

		if(age<60)
		{
			return (s.belowsixty(netsalary, deb2));
		}
		else if(age>60 && age<=80)
		{
			return s.abovesixty(netsalary, deb2);
		}
		else
		{
			return (s.aboveeight(netsalary, deb2));
		}
		
	}

}
