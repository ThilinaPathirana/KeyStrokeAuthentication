/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keystrokeauthentication;

import java.util.ArrayList;

/**
 *
 * @author Thilina Pathirana
 */



public class EventHandler {

    public final ArrayList<Double> keyspressed;
    public final ArrayList<Double> keysreleased;
    public ArrayList <Double> diffPress;
    public ArrayList <Double> diffRelease;
    public  double avgtimetoPress = 0 ;
    public  double avgtimetoRelease = 0;
    public Double diffP ;
    public Double diffR ;
    
    public EventHandler() {
        keyspressed = new ArrayList<Double>();
        keysreleased = new ArrayList<Double>();
        
    }
    
    public void Press(){
        double time = System.currentTimeMillis();
        keyspressed.add(time);
        
       //System.out.println(time);
        
    }
    
    public void Release(){
        double time = System.currentTimeMillis();
        keysreleased.add(time);
    }
    
    public void checkTimeBetweentwoPressedKeys(){
        diffPress = new ArrayList<Double>();
        for(int i=1; i<keyspressed.size();i++){
          diffP = keyspressed.get(i)-keyspressed.get(i-1);
          diffPress.add(diffP);
        }
        double countPress = 0;
        for(int j=1; j<diffPress.size();j++){
          countPress= countPress+ diffPress.get(j);
        }
        avgtimetoPress = countPress/diffPress.size();
    }  
    
   
    public void checkTimeBetweentwoReleasedKeys(){
        diffRelease = new ArrayList<Double>();
        for(int i=1; i<keysreleased.size();i++){
          diffR = keysreleased.get(i)-keysreleased.get(i-1);
          diffRelease.add(diffR);
        }
        double countRelease = 0;
        for(int j=1; j<diffRelease.size();j++){
          countRelease= countRelease+ diffRelease.get(j);
        }
        avgtimetoRelease = countRelease/diffRelease.size();
    }
    
    
    
}
