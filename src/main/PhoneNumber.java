package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by SDLAssistant on 09.09.2015.
 */
public class PhoneNumber {

    public static boolean isPhoneNumber(String str){
        Pattern p = Pattern.compile("");
        Matcher m = p.matcher(str);
        return m.matches();
    }
}
