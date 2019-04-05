package org.academiadecodigo.asciimos.bravers.hackathonapp.controllers;


import org.academiadecodigo.asciimos.bravers.hackathonapp.models.ImprovementField;
import org.academiadecodigo.asciimos.bravers.hackathonapp.services.DayService;
import org.academiadecodigo.asciimos.bravers.hackathonapp.services.StepService;
import org.academiadecodigo.asciimos.bravers.hackathonapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class MainController {

    DayService dayService;
    UserService userService;
    StepService stepService;

    @Autowired
    public void setDayService(DayService dayService) {
        this.dayService = dayService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setStepService(StepService stepService) {
        this.stepService = stepService;
    }

    @GetMapping(path = "user")
    public String getUser() {
        userService.createUser();
        userService.setDay();
        dayService.createMoodMap();
        return "/initialMood";
    }

    @PostMapping(path = "user/initialMood")
    public String setUserMood(@ModelAttribute("key") Integer key) {
        dayService.setInitialMood(key);
        return "redirect:/field";
    }

    @GetMapping(path = "field")
    public String showFields() {
        dayService.createStepList();
        return "/field";
    }


    @PostMapping(path = "user/field")
    public String setFieldImprovement(@ModelAttribute("improvementField") ImprovementField improvementField) {
        dayService.setImprovementField(improvementField);
        return "redirect:/step1";
    }

    @GetMapping(path = "socialField")
    public String getStepOne() {
        return "/step1";
    }

    @PostMapping(path = "stepOne/{boolean}")
    public String getStepTwo(@PathVariable(name = "boolean") Boolean b) {
        if(b){
            stepService.turnToAchieved();
            userService.setPoints();
            return "redirect:/step2";
        }
        return "redirect:/step2";
    }

    @PostMapping(path = "stepTwo/{boolean}")
    public String getStepThree(@PathVariable(name = "boolean") Boolean b) {
        if(b){
            stepService.turnToAchieved();
            userService.setPoints();
            return "redirect:/step3";
        }
        return "redirect:/step3";
    }

    @PostMapping(path = "stepThree/{boolean}")
    public String get(@PathVariable(name = "boolean") Boolean b) {



        if(b){
            stepService.turnToAchieved();
            userService.setPoints();
            return "redirect:/finalMood";
        }
        if (userService.getPoints() != 0) {
            return "redirect:/finalMood";
        }
        return "redirect:/failPage";
    }

    @GetMapping(path = "finalMood")
    public String showFinalMood() {
        return "/finalMood";
    }

    @PostMapping(path = "user/finalMood")
    public String setUserFinalMood(@ModelAttribute("key") Integer key) {
        dayService.setFinalMood(key);
        return "redirect:/graphic";
    }

    @GetMapping(path = "graphic")
    public String showGraphic() {
        return "/graphic";
    }
}
