package com.lambferret.design_pattern.controller;

import com.lambferret.design_pattern.service.TemplateService;
import com.lambferret.design_pattern.setting.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplateController {

    TemplateService templateService;

    public TemplateController(TemplateService templateService) {
        this.templateService = templateService;
    }

    @GetMapping("/")
    public ResponseEntity getRequest() {
        ResponseEntity response = new ResponseEntity("OK", 200, "정상");
        return response;
    }

}



