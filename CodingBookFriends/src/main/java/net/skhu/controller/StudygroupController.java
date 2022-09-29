package net.skhu.controller;

import java.math.BigInteger;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.skhu.dto.Studygroup;
import net.skhu.mapper.LearningMaterialMapper;
import net.skhu.mapper.StudygroupMapper;

@Controller
@RequestMapping("/studygroup")
public class StudygroupController {

    @Autowired StudygroupMapper studygroupMapper;
    @Autowired LearningMaterialMapper learningMaterialMapper;

    @RequestMapping("list")
    public String list(Model model,HttpSession session, HttpServletRequest request)throws Exception {
        List<Studygroup> studygroups = studygroupMapper.findAll();
        model.addAttribute("studygroups", studygroups);
        return "studygroup/list";
    }

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("studygroup", new Studygroup());
        return "studygroup/edit";
    }

    @PostMapping("create")
    public String create(Model model, Studygroup studygroup) {
    	studygroupMapper.insert(studygroup);
        return "redirect:list";
    }

    @GetMapping("edit")
    public String edit(Model model,
    		@RequestParam(value ="studyGroup_id", required=false) BigInteger studyGroup_id) {
    	Studygroup studygroup = studygroupMapper.findOne(studyGroup_id);
        model.addAttribute("studygroup", studygroup);
        return "studygroup/edit";
    }

    @PostMapping("edit")
    public String edit(Model model, Studygroup studygroup) {
    	studygroupMapper.update(studygroup);
    	model.addAttribute("message", "저장했습니다.");
        return "redirect:list";
    }

    @GetMapping("detail")
    public String detail(Model model,@RequestParam(value ="studyGroup_id", required=false) BigInteger studyGroup_id) {
        List<Studygroup> studygroups = studygroupMapper.findAll();
        model.addAttribute("studygroups", studygroups);
    	Studygroup studygroup = studygroupMapper.findOne(studyGroup_id);
        model.addAttribute("studygroup", studygroup);
        model.addAttribute("learningMaterials", learningMaterialMapper.findAll());
        return "studygroup/detail";
    }


    @RequestMapping("delete")
    public String delete(Model model, @RequestParam(value ="studyGroup_id", required=false) BigInteger studyGroup_id) {
    	studygroupMapper.delete(studyGroup_id);
        return "redirect:list";
    }



}
