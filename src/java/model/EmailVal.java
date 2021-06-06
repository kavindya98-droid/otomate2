
package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVal {
   

    public static String isValidEmail(String mail){
    
    String validity;
    String email=mail;
   String expression="^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
  
         
        Pattern p=Pattern.compile(expression,Pattern.CASE_INSENSITIVE);

      
        Matcher m=p.matcher(email);
        boolean b=m.matches();
        if (b==true) {
            validity="valid email id";
        }else{
        validity="invalid email id";
        }
    return validity;
    }
        
    }  

