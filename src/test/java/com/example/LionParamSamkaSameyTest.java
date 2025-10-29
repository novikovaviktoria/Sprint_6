package com.example;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;



@RunWith(Parameterized.class)

public class LionParamSamkaSameyTest {
    private Feline feline;
    private final String gender;
    private final boolean hasMane;

    public LionParamSamkaSameyTest(String gender, boolean hasMane) {
        this.gender = gender;
        this.hasMane = hasMane;
    }

    @Before
    public void init() {
        feline = Mockito.mock(Feline.class);
    }


    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void TestDoesLionHasMane() throws Exception {
        Lion lion = new Lion(gender, feline);
        boolean actualHasMane = lion.doesHaveMane();
        Assert.assertEquals(hasMane, actualHasMane);
    }
}
