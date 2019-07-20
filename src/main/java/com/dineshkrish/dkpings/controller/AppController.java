package com.dineshkrish.dkpings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/apps")
public class AppController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add() {

    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void update() {

    }

    public void getAll() {

    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public void delte() {

    }
}
