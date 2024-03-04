package com.security.authy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class DashboardController {

        @GetMapping("/dashboard")
        public String getDashboard() {
            return "Dashboard protected.";
        }
    }
