package com.fonseca.algasensors.device.management.api.model;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class SensorInput {
    @NotBlank
    @Size(min = 2, max = 100, message = "Nome deve ter entre 2 e 100 caracteres")
    private  String name;
    @NotBlank
    @Pattern(regexp = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$",
            message = "IP deve estar em formato válido (ex: 192.168.1.1)")
    private String ip;
    @NotBlank
    @Size(min = 2, max = 200, message = "Localização deve ter entre 2 e 200 caracteres")
    private String location;
    @NotBlank
    private String protocol;
    @NotBlank
    @Size(min = 2, max = 100, message = "Modelo deve ter entre 2 e 50 caracteres")
    private  String model;
}
