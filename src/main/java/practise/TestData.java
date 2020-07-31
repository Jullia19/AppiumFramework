package practise;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "InputData")
    public Object[][] getDataForEditField(){
        Object[][] objects = new Object[][]{
                {"hello"}, {"$%$^&^%$#"}
        };
        return objects;
    }
}
