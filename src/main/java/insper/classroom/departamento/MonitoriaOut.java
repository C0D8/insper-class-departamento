package insper.classroom.departamento;

import lombok.Builder;
import lombok.experimental.Accessors;
//importar data 


@Builder
@Accessors(fluent = true, chain = true)
public record MonitoriaOut (
    String data,
    String duracao,
    String nome

) {
    
}
