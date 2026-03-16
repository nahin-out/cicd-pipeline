package com.learning.pipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
        @GetMapping("/")
        public String home() {
                return "Pipeline is running!";
        }

        @GetMapping("/healthz")
        public String healthz() {
                return "Healthy! code deployed with codeDeployed.";
        }

        @GetMapping("/hi")
        public String hi() {
                return "Hello, World!";
        }
}
