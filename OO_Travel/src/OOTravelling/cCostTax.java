/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOTravelling;

/**
 *
 * @author ALAMIIA
 */
class cCostTax {
    
    
    public double mcTax = 0.90;
    
    public Double cFindTax(double cAmount)
    {
        double FindTax = cAmount - (cAmount * mcTax) ;
        
        return FindTax;
    }
}
