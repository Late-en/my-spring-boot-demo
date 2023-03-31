package exceptionHandler.exception;

import exceptionHandler.constant.Status;
import jdk.net.SocketFlow;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Late-en
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class BaseException extends RuntimeException {
    private Integer code;
    private String message;

    public BaseException(Status status) {
        super(status.getMessage());
        this.code = getCode();
        this.message = getMessage();
    }

    public BaseException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }
}
