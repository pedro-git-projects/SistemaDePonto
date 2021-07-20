package com.lambda.acesso.model;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

public class JornadaTrabalho {
    private long id;
    private String descricao;

}
