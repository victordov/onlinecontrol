//package com.vizaco.onlinecontrol.utils;
//
//import com.vizaco.onlinecontrol.service.UserService;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.util.Map;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Matchers.any;
//import static org.mockito.Mockito.mock;
//
///**
// * Created by super on 3/10/15.
// */
//public class JsonUtilTest {
//
//    private JsonUtil jsonUtil;
//
//    @Before
//    public void setUp() throws Exception {
//        jsonUtil = new JsonUtil();
//    }
//
//    @Test
//    public void getJsonElementWithKey1Test() throws IOException {
//        String jsonText = "{\"key1\":\"value1\", \"key2\":\"value2\", \"key3\":\"value3\"}";
//        String actual = jsonUtil.getJsonElement(jsonText, "key1");
//        assertEquals("value1", actual);
//    }
//
//    @Test
//    public void getJsonElementWithKey3Test() throws IOException {
//        String jsonText = "{\"key1\":\"value1\", \"key2\":\"value2\", \"key3\":\"value3\"}";
//        String actual = jsonUtil.getJsonElement(jsonText, "key3");
//        assertEquals("value3", actual);
//    }
//
//    @Test
//    public void getJsonElementWithNullKeyTest() throws IOException {
//        String jsonText = "{\"key1\":\"value1\", \"key2\":\"value2\", \"key3\":\"value3\"}";
//        String actual = jsonUtil.getJsonElement(jsonText, null);
//        assertEquals(null, actual);
//    }
//
//    @Test
//    public void getJsonElementWithZeroKeyTest() throws IOException {
//        String jsonText = "{}";
//        String actual = jsonUtil.getJsonElement(jsonText, null);
//        assertEquals(null, actual);
//    }
//
//    @Test(expected = IOException.class)
//    public void getJsonElementWithIncorrectJsonTextTest() throws IOException {
//        String jsonText = "{abc.xyz}";
//        String actual = jsonUtil.getJsonElement(jsonText, "key");
//    }
//
//    @Test
//    public void getJsonElementWithNullJsonTextTest() throws IOException {
//        String jsonText = null;
//        String actual = jsonUtil.getJsonElement(jsonText, "key");
//        assertEquals(null, actual);
//    }
//
//    @Test
//    public void getMapFromJsonElementWith3KeyTest() throws IOException {
//        String jsonText = "{\"key1\":\"value1\", \"key2\":\"value2\", \"key3\":\"value3\"}";
//        Map<String, Object> mapFromJsonElement = jsonUtil.getMapFromJsonElement(jsonText);
//        assertEquals(3, mapFromJsonElement.size());
//    }
//
//    @Test
//    public void getMapFromJsonElementWith2KeyTest() throws IOException {
//        String jsonText = "{\"key1\":\"value1\", \"key3\":\"value3\"}";
//        Map<String, Object> mapFromJsonElement = jsonUtil.getMapFromJsonElement(jsonText);
//        assertEquals(2, mapFromJsonElement.size());
//    }
//
//    @Test
//    public void getMapFromJsonElementWithZeroKeyTest() throws IOException {
//        String jsonText = "{}";
//        Map<String, Object> mapFromJsonElement = jsonUtil.getMapFromJsonElement(jsonText);
//        assertEquals(0, mapFromJsonElement.size());
//    }
//
//    @Test(expected = IOException.class)
//    public void getMapFromJsonElementWithIncorrectJsonTextTest() throws IOException {
//        String jsonText = "{abc.xyz}";
//        Map<String, Object> mapFromJsonElement = jsonUtil.getMapFromJsonElement(jsonText);
//    }
//
//    @Test
//    public void getMapFromJsonElementWithNullJsonTextTest() throws IOException {
//        String jsonText = null;
//        Map<String, Object> mapFromJsonElement = jsonUtil.getMapFromJsonElement(jsonText);
//        assertEquals(null, mapFromJsonElement);
//    }
//
//}
