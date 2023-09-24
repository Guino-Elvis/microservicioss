package upeu.edu.pe.workers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import upeu.edu.pe.workers.entity.Workers;
import upeu.edu.pe.workers.service.WorkersService;

@RestController
@RequestMapping("/workers")
public class WorkersController {
    @Autowired
    private WorkersService workersService;

    @GetMapping()
    public ResponseEntity<List<Workers>> list() {
        return ResponseEntity.ok().body(workersService.listar());
    }

    @PostMapping()
    public ResponseEntity<Workers> save(@RequestBody Workers workers) {
        return ResponseEntity.ok(workersService.guardar(workers));
    }

    @PutMapping()
    public ResponseEntity<Workers> update(@RequestBody Workers workers) {
        return ResponseEntity.ok(workersService.actualizar(workers));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Workers> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(workersService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        workersService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
