package insper.classroom.departamento;

import lombok.Builder;
import lombok.experimental.Accessors;
//importar data 


@Builder
@Accessors(fluent = true, chain = true)
public record DepartamentoOut (
    String data,
    String duracao,
    String nome

) {
    
}
