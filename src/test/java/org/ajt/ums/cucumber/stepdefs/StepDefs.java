package org.ajt.ums.cucumber.stepdefs;

import org.ajt.ums.UmsApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = UmsApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
