package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by SDLAssistant on 09.09.2015.
 */
public class Data {

    public static boolean isData(String str){
        Pattern p = Pattern.compile("");
        Matcher m = p.matcher(str);
        return m.matches();
    }
}
