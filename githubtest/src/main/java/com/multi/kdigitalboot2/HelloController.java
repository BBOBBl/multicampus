package com.multi.kdigitalboot2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

		@RequestMapping("/hello")
		public String start() {
			return "hello";
		}
}
