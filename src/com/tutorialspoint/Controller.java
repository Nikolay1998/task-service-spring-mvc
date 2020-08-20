package com.tutorialspoint;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {
    @GetMapping("/")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("index", "task", new Task());
    }

    @ModelAttribute("typesList")
    public List<Task.Type> getTypesList() {
        return Arrays.asList(Task.Type.values());
    }

    @RequestMapping(value = "/addTask", method = RequestMethod.POST)
    public String firstTask(@ModelAttribute("task")Task task, BindingResult result, Model model){
        model.addAttribute("answer", task.getType().toString());
        return "index";
    }
}
