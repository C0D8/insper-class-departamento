package insper.classroom.departamento;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("classroom-departamento")
public interface DepartamentoController {

    @PostMapping("/departamentos/register")
    ResponseEntity<?> create (
        @RequestBody(required = true) CreateDepartamentoIn in
    );

    @GetMapping("departamentos/{id}")
    ResponseEntity<?> get (
        @PathVariable(required = true) String id
        
    );
    
   
}