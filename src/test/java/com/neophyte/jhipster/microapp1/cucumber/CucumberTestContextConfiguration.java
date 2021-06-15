package com.neophyte.jhipster.microapp1.cucumber;

import com.neophyte.jhipster.microapp1.Microserviceapp1App;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = Microserviceapp1App.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
