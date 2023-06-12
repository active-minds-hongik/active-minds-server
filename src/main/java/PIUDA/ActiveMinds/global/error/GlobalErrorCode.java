package PIUDA.ActiveMinds.global.error;

import PIUDA.ActiveMinds.global.common.dto.ErrorReason;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

@Getter
@AllArgsConstructor
public enum GlobalErrorCode implements BaseErrorCode{

    _INTERNAL_SERVER_ERROR(INTERNAL_SERVER_ERROR, "GLOBAL_500_1", "서버 오류. 관리자에게 문의 부탁드립니다."),
    MULTIPART_SIZE_EXCEED(BAD_REQUEST, "GLOBAL_400_1", "파일 용량이 너무 큽니다."),
    ;

    private HttpStatus status;
    private String code;
    private String reason;

    @Override
    public ErrorReason getErrorReason() {
        return ErrorReason.from(status.value(), code, reason);
    }
}
