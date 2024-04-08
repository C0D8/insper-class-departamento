package insper.classroom.departamento;

import lombok.Builder;
import lombok.experimental.Accessors;
//importar data 


@Builder
@Accessors(fluent = true, chain = true)
public record CreateMonitoriaIn (
    String data,
    String duracao,
    String descricao,
    String nome,
    String id_professor
) {
    
}
