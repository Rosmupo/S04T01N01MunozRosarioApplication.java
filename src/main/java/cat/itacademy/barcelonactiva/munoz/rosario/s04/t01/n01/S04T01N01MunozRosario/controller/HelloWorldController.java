package cat.itacademy.barcelonactiva.munoz.rosario.s04.t01.n01.S04T01N01MunozRosario.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String hello(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String nombre) {

        return "Hola, " + nombre + ". Estàs executant un projecte Maven";

    }

    @GetMapping(value = {"HelloWorld2", "/HelloWorld2/{nombre}"})
    @ResponseBody
    public String hello2(@PathVariable(required = false) String nombre) {
        if (nombre == null) {
            nombre = "UNKNOWN";
        }
        return "Hola, " + nombre + ". Estàs executant un projecte Maven";

    }


}
