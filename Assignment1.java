package cop2805;

public class Assignment1 {

	public static void main(String[] args) {
		
		/*
		Sales Amount                Commission Rate
		-----------------------------------------------
		$0.00-$5,000 				8%
		$5,000.01 - $10,000 		10%
		$10,000.01- and above 		12%
		*/
		
		double salesAmount = 1000;
		double maxSalesAmount = 20000;
		
		//output and format the first line for "Sales" and "Income" columns
		System.out.printf("%-21s %s\n", "Sales", "Income");

		//loop the output until the maxSaleAmount is reached
		while(salesAmount <= maxSalesAmount) {
			
			//output and format the sales amount and the income
			System.out.printf("$%-20.2f $%.2f\n", salesAmount, computeIncome(salesAmount));
			
			//increment by 1000 until it reaches the maxSalesAmount
			salesAmount += 1000;
		}
	}
	
	//function to compute the income based on sale amount
	public static double computeIncome(double salesAmount){
		
		double baseSalary = 5000;
		double income = 0, tempAmount = 0, commission = 0;
		double tierCommission;
		
		//if sales amount third tier ($10,000.01- and above), then multiply sales by .12 commission rate
		if(salesAmount > 10000) {
			tempAmount = salesAmount - 10000;
			salesAmount = salesAmount - tempAmount;
			tierCommission = tempAmount * .12;
			commission += tierCommission;
		} 
		
		//if sales amount second tier ($5,000.01 - $10,000), then multiply sales by tier .10 commission rate
		if(salesAmount > 5000) {
			tempAmount = salesAmount - 5000;
			salesAmount = salesAmount - tempAmount;
			tierCommission = tempAmount * .10;
			commission += tierCommission;
		} 
		
		//if sales amount first tier ($0.00-$5,000), then multiply sales by .08 commission rate
		if(salesAmount <= 5000) {
			tierCommission = salesAmount * .08;
			commission += tierCommission;
		}
		
		//add base salary w/ commission to find total income
		income = baseSalary + commission;
		
		//return income
		return income;
	}	
}
