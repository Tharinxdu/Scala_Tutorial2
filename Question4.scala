object O1 extends App
{
    def grossCost(price:Double,noOfCopies:Int) = 
        {
            price * 0.6 * noOfCopies;
        }
    
    def shippingCost(noOfCopies:Int) = 
        {
            50 * 3 + (noOfCopies - 50) * 0.75;   
        }
    
    def netCost(price:Double,noOfCopies:Int) = 
        {
            grossCost(price,noOfCopies) + shippingCost(noOfCopies);
        }

    println(netCost(24.95,60));
}