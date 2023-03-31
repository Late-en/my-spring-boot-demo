package exceptionHandler.model;

import exceptionHandler.constant.Status;
import exceptionHandler.exception.BaseException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Late-en
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {
    //状态码
    private Integer code;
    //返回内容
    private String message;
    //返回数据
    private Object data;

    /**
     * 构造一个自定义的API返回
     */
    public static ApiResponse of(Integer code, String message, Object data) {
        return new ApiResponse(code, message, data);
    }

    /**
     * 构造一个有状态且带数据的API返回
     */
    public static ApiResponse ofStatus(Status status, Object data) {
        return of(status.getCode(), status.getMessage(), data);
    }

    /**
     * 构造一个成功且带数据的API返回
     */
    public static ApiResponse ofSuccess(Object data) {
        return ofStatus(Status.OK, data);
    }

    /**
     * 构造一个成功且自定义消息的API返回
     */
    public static ApiResponse ofMessage(String message) {
        return of(Status.OK.getCode(), message, null);
    }

    /**
     * 构造一个有状态的API返回
     */
    public static ApiResponse ofStatus(Status status) {
        return ofStatus(status, null);
    }

    /**
     * 构造一个异常且带数据的API返回
     */
    public static <T extends BaseException> ApiResponse ofException(T t, Object data) {
        return of(t.getCode(), t.getMessage(), data);
    }

    /**
     * 构造一个异常且带数据的API返回
     */
    public static <T extends BaseException> ApiResponse ofException(T t) {
        return ofException(t, null);
    }
}
