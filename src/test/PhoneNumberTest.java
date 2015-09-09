package test;

import junit.framework.TestCase;
import main.HashTag;
import main.PhoneNumber;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneNumberTest extends TestCase {

    private HashMap<String, Boolean> testMap = new HashMap<String, Boolean>();

    private void fillData(){
        testMap.put("+79328472646", true);
        testMap.put("89328472646", true);
        testMap.put("+7 932 847 26 46", true);
        testMap.put("8 932 847 26 46", true);
        testMap.put("+7(932)8472646", true);
        testMap.put("8(932)8472646", true);
        testMap.put("+7-932-847-26-46", true);
        testMap.put("8-932-847-26-46", true);
        testMap.put("9328472646", true);
        testMap.put("+793284726467", false);
        testMap.put("+69328472646",false);
        testMap.put("49328472646",false);
        testMap.put("+3 932 847 26 46", false);
        testMap.put("4 932 847 26 46", false);

    }

    @Test
    public void testIsPhoneNumber(){
        fillData();
        Set<Map.Entry<String, Boolean>> testSet = testMap.entrySet();
        for(Map.Entry<String, Boolean> testPair : testSet) {
            Assert.assertTrue(testPair.getKey(), PhoneNumber.isPhoneNumber(testPair.getKey()) == testPair.getValue());
        }
    }
}