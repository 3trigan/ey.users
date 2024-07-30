package cl.ey.users.controllers.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {

    String mensaje;

    public ErrorResponse(String mensaje) {
        this.mensaje = mensaje;
    }
}
