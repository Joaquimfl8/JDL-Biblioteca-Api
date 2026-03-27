// isso é só teste aaaaa

package JDL.Biblioteca.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    
    @GetMapping("/get")
    public String getAluno(@RequestParam int id) {
        return "";
    }

    @PostMapping("/post")
    public String postStudentName(@RequestParam String nome) {
        return "";
    }
}
