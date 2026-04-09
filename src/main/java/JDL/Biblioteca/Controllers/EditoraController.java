package JDL.Biblioteca.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import JDL.Biblioteca.Models.Editora;
import JDL.Biblioteca.Services.EditoraService;
import java.util.List;

@RestController
@RequestMapping("/editoras") 
public class EditoraController {
    private final EditoraService editoraService;

    @Autowired
    public EditoraController(EditoraService editoraService) {
        this.editoraService = editoraService;
    }

    @GetMapping("/get")
    public List<Editora> getAllEditoras() {
        return editoraService.getAllEditoras();
    }

    @GetMapping("/get/{id}")
    public Editora getEditoraById(@PathVariable Integer id) {
        return editoraService.getEditoraById(id);
    }

    @PostMapping("/post")
    public Editora createEditora(@RequestBody Editora editora) {
        return editoraService.createEditora(editora);
    }

    @PutMapping("/put/{id}")
    public Editora updateEditora(@PathVariable Integer id, @RequestBody Editora editora) {
        return editoraService.updateEditora(id, editora);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteEditora(@PathVariable Integer id) {
        return editoraService.deleteEditora(id);
    }
}