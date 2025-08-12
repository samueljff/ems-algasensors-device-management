package com.fonseca.algasensors.device.management.api.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SensorInput {
    @NotNull(message = "Nome é obrigatório")
    @NotEmpty @NotBlank(message = "Nome não pode estar em branco")
    private  String name;
    @NotNull(message = "IP é obrigatório")
    @NotBlank(message = "IP não pode estar em branco")
    private String ip;
    @NotNull(message = "Localização é obrigatória")
    @NotBlank(message = "Localização não pode estar em branco")
    private String location;
    @NotNull(message = "Protocolo é obrigatório")
    @NotBlank(message = "Protocolo não pode estar em branco")
    private String protocol;
    @NotNull(message = "Modelo é obrigatório")
    @NotBlank(message = "Modelo não pode estar em branco")
    private  String model;
}
