/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;

import java.util.Random;

/**
 *
 * @author Ivan Kadery
 */
public class Qs {
    
     int n=1;
    public String getlabel(){
    if(n==1)return ""+"All-righty then! is the famous quotation of which movie character?";
    else  return ""+"We came. We saw. We kicked its ass.was quoted by the character DR. PETER VENKMAN in Ivan Reitman's 1984 Film 'Ghostbusters'.Who portrayed the character DR. PETER VENKMAN in that film?";
    }
    public String getop1()
    {
    if(n==1){return ""+"Ace";}
    else {return ""+"Adar";}
    //n++;
    
    }
   
}
