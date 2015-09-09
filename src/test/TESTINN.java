package test;


import junit.framework.TestCase;
import main.INN;
import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by SDLAssistant on 09.09.2015.
 */

public class TESTINN extends TestCase{

    private HashMap<String, Boolean> testMap = new HashMap<String, Boolean>();

    private void fillData(){
        testMap.put("765432789098", true);
        testMap.put("789", false);
        testMap.put("000000888a777", false);
        testMap.put("000 9876 999 09", true);
    }

    @Test
    public void testIsINN(){
        fillData();
        Set<Map.Entry<String, Boolean>> testSet = testMap.entrySet();
        for(Map.Entry<String, Boolean> testPair : testSet) {
            Assert.assertTrue(testPair.getKey(), INN.isINN(testPair.getKey()) == testPair.getValue());
        }
    }


}
