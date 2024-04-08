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

    //criar metodo para o departamento criar a aula ou monitoria 

    @PostMapping("/departamentos/{id}/aulas")
    ResponseEntity<?> createAula (
        @PathVariable(required = true) String id,
        @RequestBody(required = true) CreateAulaIn in
    );

    @PostMapping("/departamentos/{id}/monitorias")
    ResponseEntity<?> createMonitoria (
        @PathVariable(required = true) String id,
        @RequestBody(required = true) CreateMonitoriaIn in
    );

    @GetMapping("/departamentos/{id}/aulas")
    ResponseEntity<?> getAulas (
        @PathVariable(required = true) String id
    );

    @GetMapping("/departamentos/{id}/monitorias")
    ResponseEntity<?> getMonitorias (
        @PathVariable(required = true) String id
    );
    
   
}