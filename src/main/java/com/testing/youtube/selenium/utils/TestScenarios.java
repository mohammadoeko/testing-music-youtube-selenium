package com.testing.youtube.selenium.utils;

public enum TestScenarios {

    // UPLOAD DATA
    T1("TCC.Search.001 Input search data and click enter"),
    T2("TCC.Search.002 Input does not match search data and click enter"),
    T3("TCC.Search.003 Input empty search data")
    ;

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}

