package com.dineshkrish.dkpings.controller;

import com.dineshkrish.dkpings.dto.AppDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/apps")
public class AppController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute AppDTO appDTO) {
        return "";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update() {
        return "";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String getAll() {
        return "";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delte() {
        return "";
    }
}
