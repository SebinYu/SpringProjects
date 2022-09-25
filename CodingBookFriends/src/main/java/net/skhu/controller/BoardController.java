package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.skhu.dto.Board;
import net.skhu.mapper.BoardMapper;

@Controller
@RequestMapping("/studygroups")
public class BoardController {

    @Autowired BoardMapper boardMapper;


    @RequestMapping("list")
    public String list(Model model) {
        List<Board> titles = boardMapper.findAll();
        model.addAttribute("titles", titles);
        return "studygroups/list";
    }

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("titles", new Board());
        return "studygroups/edit";
    }

    @PostMapping("create")
    public String create(Model model, Board title) {
        boardMapper.insert(title);
        return "redirect:list";
    }

    @GetMapping("edit")
    public String edit(Model model) {
        model.addAttribute("title", new Board());
        model.addAttribute("titles", boardMapper.findAll());
        return "studygroups/edit";
    }

    @PostMapping("edit")
    public String edit(Model model, Board title) {
        // TODO: DB 저장 기능을 구현해야 함.
        model.addAttribute("message", "저장했습니다.");
        model.addAttribute("titles", boardMapper.findAll());
        return "studygroups/edit";
    }


    @RequestMapping("delete")
    public String delete(Model model, @RequestParam("studyGroup_id") int studyGroup_id) {
        boardMapper.delete(studyGroup_id);
        return "redirect:list";
    }
}
