package com.busanit501.bootproject.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
//@RequestMapping("/calender")
@RequiredArgsConstructor
public class CalenderController {

        @GetMapping("/calender")
        public String calender() {
                return "calender";
        }

        @GetMapping("/calender2")
        public void calender2() {

        }
}
