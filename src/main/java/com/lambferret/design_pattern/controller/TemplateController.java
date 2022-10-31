package com.lambferret.design_pattern.controller;

import com.lambferret.design_pattern.service.TemplateService;
import com.lambferret.design_pattern.setting.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TemplateController {

    TemplateService templateService;

    public TemplateController(TemplateService templateService) {
        this.templateService = templateService;
    }

    @GetMapping("/")
    public ResponseEntity getRequest() {

        return new ResponseEntity("OK", 200, "정상");
    }

}



