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
                return "not Healthy! but chole. codeDeployed.";
        }

        @GetMapping("/hix")
        public String hix() {
                return "Hello, World, I'm nobody!";
        }
}
