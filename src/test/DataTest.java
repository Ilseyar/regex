package test;

import junit.framework.TestCase;
import main.Data;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DataTest extends TestCase {
    private HashMap<String, Boolean> testMap = new HashMap<String, Boolean>();

    private void fillData(){
        testMap.put("18.09.2012", true);
        testMap.put("30.09.2001", true);
        testMap.put("01.12.1995", true);
        testMap.put("07.01.1001", true);
        testMap.put("20.10.2010", true);
        testMap.put("01.01.2000", true);
        testMap.put("22.07.2007", true);
        testMap.put("05.05.2010", true);
        testMap.put("18.9.2012", false);
        testMap.put("09.09.2016", false);
        testMap.put("01.00.2012", false);
        testMap.put("25.13.2015", false);
        testMap.put("00.11.1996", false);
        testMap.put("4.12.2012", false);
        testMap.put("b04.12.2012", false);
        testMap.put("04.12.2012c", false);
    }

    @Test
    public void testIsData(){
        fillData();
        Set<Map.Entry<String, Boolean>> testSet = testMap.entrySet();
        for(Map.Entry<String, Boolean> testPair : testSet) {
            Assert.assertTrue(testPair.getKey(), Data.isData(testPair.getKey()) == testPair.getValue());
        }
    }

}