package dataProviders;

import org.testng.annotations.Test;

public class example {


    @Test(groups = {"f"})
    public void f(){

    }

    @Test(groups = {"g", "g1", "g2"}, dependsOnGroups = "f")
    public void g(){

    }
}
