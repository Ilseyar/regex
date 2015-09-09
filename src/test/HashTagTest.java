package test;

import junit.framework.TestCase;
import main.HashTag;
import main.INN;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashTagTest extends TestCase {

    private HashMap<String, Boolean> testMap = new HashMap<String, Boolean>();

    private void fillData(){
        testMap.put("#sunnyday", true);
        testMap.put("#beautiful_weather", true);
        testMap.put("#impossible_thing", true);
        testMap.put("goodmorning", false);
        testMap.put("#best_freind #forever_young", true);
        testMap.put("#strange_thing?", false);
        testMap.put("# java_lesson", false);
        testMap.put("#misshome#hate_the_road", true);
        testMap.put("#", false);
        testMap.put("#thenightisyoung#", false);
    }

    @Test
    public void testIsHashTag(){
        fillData();
        Set<Map.Entry<String, Boolean>> testSet = testMap.entrySet();
        for(Map.Entry<String, Boolean> testPair : testSet) {
            Assert.assertTrue(testPair.getKey(), HashTag.isHashTag(testPair.getKey()) == testPair.getValue());
        }
    }

}