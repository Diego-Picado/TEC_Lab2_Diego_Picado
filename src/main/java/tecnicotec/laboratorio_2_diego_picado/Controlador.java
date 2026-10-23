package tecnicotec.laboratorio_2_diego_picado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
    @GetMapping("/s")
    public String S() {
        return "s";
    }

    @GetMapping("/o")
    public String O() {
        return "o";
    }

    @GetMapping("/l")
    public String L() {
        return "l";
    }

    @GetMapping("/i")
    public String I() {
        return "i";
    }

    @GetMapping("/d")
    public String D() {
        return "d";
    }



}
