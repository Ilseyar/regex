package test;

import junit.framework.TestCase;
import main.Link;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LinkTest extends TestCase {

    private HashMap<String, Boolean> testMap = new HashMap<String, Boolean>();

    private void fillData(){
        testMap.put("http://example.com", true);
        testMap.put("https://example.com", true);
        testMap.put("http://example.ru", true);
        testMap.put("https://example.ru", true);
        testMap.put("http://example.ua", true);
        testMap.put("https://example.ua", true);
        testMap.put("https://itis405/example.ru", true);
        testMap.put("https://itis405/example.ru", true);
        testMap.put("http://home//profile/", false);
        testMap.put("https://home//profile/", false);

    }

    @Test
    public void testIsLink(){
        fillData();
        Set<Map.Entry<String, Boolean>> testSet = testMap.entrySet();
        for(Map.Entry<String, Boolean> testPair : testSet) {
            Assert.assertTrue(testPair.getKey(), Link.isLink(testPair.getKey()) == testPair.getValue());
        }
    }

}