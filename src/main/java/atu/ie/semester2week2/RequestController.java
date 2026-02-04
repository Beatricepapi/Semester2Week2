package atu.ie.semester2week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {
    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name)
    {
        return "Hello "+name;
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam Integer age)
    {
        return "Hello" + name + " " + age;
    }
    @GetMapping("/person")
    public Person getPerson()
    {
        Person person = new Person("Finnya", 21);
        return person;
    }
}
