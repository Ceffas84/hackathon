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
        dayService.createMoodMap();
        userService.createUser();
        userService.setDay();
        return "/initialMood";
    }

    @GetMapping(path = "initialMood{mood}")
    public String setUserMood(@PathVariable(name = "mood") Integer mood) {
        dayService.setInitialMood(mood);
        return "redirect:/field";
    }

    @GetMapping(path = "showField")
    public String showFields() {
        dayService.createStepList();
        return "/field";
    }


    @GetMapping(path = "field")
    public String setFieldImprovement(@ModelAttribute("improvementField") ImprovementField improvementField) {
        dayService.setImprovementField(improvementField);
        return "redirect:/showStep1";
    }

    @GetMapping(path = "showStep1")
    public String getStepOne() {
        return "/step1";
    }

    @GetMapping(path = "step1")
    public String getStepTwo(@RequestParam(name = "completed") String completed) {
        if(completed.equals("true")){
            stepService.turnToAchieved();
            userService.addPoints();
            return "redirect:/showStep2";
        }
        return "redirect:/showStep2";
    }

    @GetMapping(path = "showStep2")
    public String showStepTwo() {
        return "/step2";
    }

    @GetMapping(path = "step2")
    public String getStepThree(@RequestParam(name = "completed") String completed) {
        if(completed.equals("true")){
            stepService.turnToAchieved();
            userService.addPoints();
            return "redirect:/showStep3";
        }
        return "redirect:/showStep3";
    }

    @GetMapping(path = "showStep3")
    public String showStepThree() {
        return "/step3";
    }

    @GetMapping(path = "step3")
    public String get(@RequestParam(name = "completed") String completed) {

        if(completed.equals("true")){
            stepService.turnToAchieved();
            userService.addPoints();
            return "redirect:/showFinalMood";
        }
        if (userService.getPoints() != 0) {
            return "redirect:/showFinalMood";
        }
        return "redirect:/failPage";
    }

    @GetMapping(path = "failPage")
    public String showFailPage() {
        return "/failPage";
    }


    @GetMapping(path = "showFinalMood")
    public String showFinalMood() {
        return "/finalMood";
    }

    @GetMapping(path = "finalMood{mood}")
    public String setUserFinalMood(@PathVariable("mood") Integer mood) {
        dayService.setFinalMood(mood);
        return "redirect:/graphic";
    }

    @GetMapping(path = "graphic")
    public String showGraphic() {
        return "/graphic";
    }
}
