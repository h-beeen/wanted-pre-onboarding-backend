package kr.co.wanted.onboarding.exception;

import kr.co.wanted.onboarding.exception.error.ErrorCode;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

	private final ErrorCode errorCode;

	private BusinessException(ErrorCode errorCode) {
		super(errorCode.getMessage());
		this.errorCode = errorCode;
	}

	public static BusinessException of(ErrorCode errorCode) {
		return new BusinessException(errorCode);
	}
}
