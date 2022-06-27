package com.example.demok8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/test")
    public String test(){
        System.out.println("Hello Thientv7");
        return "Hello Thientv7";
    }
}


//        echo "# git-cicd-example" >> README.md
//        git init
//        git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin https://github.com/thientvse/git-cicd-example.git
//        git push -u origin main
