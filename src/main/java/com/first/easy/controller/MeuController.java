import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MeuController {

    @GetMapping("/mensagem")
    public String getMensagem() {
        return "Olá do back-end!";
    }

    @PostMapping("/enviar")
    public String receberDados(@RequestBody String dados) {
        return "Você enviou: " + dados;
    }
}