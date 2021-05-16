object WholesaleQ3 extends App{
	def costExShip(n:Double)=n*(24.95-(24.95*40/100));
	def shippingFirstM(x:Double)=(((x-50)*0.75)+3);

	println("Total cost is Rs. " + (shippingFirstM(60) + costExShip(60)) );
	
} 