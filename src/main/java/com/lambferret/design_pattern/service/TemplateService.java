package com.lambferret.design_pattern.service;

import com.lambferret.design_pattern.repository.TemplateRepository;
import org.springframework.stereotype.Service;

@Service
public class TemplateService {

    TemplateRepository templateRepository;

    public TemplateService(TemplateRepository templateRepository) {
        this.templateRepository = templateRepository;
    }
}
