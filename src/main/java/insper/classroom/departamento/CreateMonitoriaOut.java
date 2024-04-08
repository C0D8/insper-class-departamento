package insper.classroom.departamento;

import lombok.Builder;
import lombok.experimental.Accessors;


@Builder
@Accessors(fluent = true, chain = true)
public record CreateMonitoriaOut (
    String id
){
    
}
