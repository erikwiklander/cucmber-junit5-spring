package com.example.demo;

import io.cucumber.junit.platform.engine.Cucumber;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@Cucumber
@SpringBootTest
@CucumberContextConfiguration
class DemoApplicationTests {

    @Autowired
    String test;

}
