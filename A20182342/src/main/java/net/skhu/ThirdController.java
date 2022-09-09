package net.skhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/third")
public class ThirdController {

    @RequestMapping("test1")
    public String test1(Model model) {
		Student student1 = new Student(12345, "20182342", "유세빈", "sebinyu72@gmail.com");
		model.addAttribute("student1",student1);
        return "third/test1";
    }

}
