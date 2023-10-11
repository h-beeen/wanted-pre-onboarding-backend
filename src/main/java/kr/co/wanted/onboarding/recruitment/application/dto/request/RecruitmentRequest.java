package kr.co.wanted.onboarding.recruitment.application.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record RecruitmentRequest(
	@NotNull(message = "회사 아이디가 유효하지 않아요.")
	Long companyId,

	@NotNull(message = "지원 포지션이 유효하지 않아요.")
	String position,

	@NotNull(message = "채용 보상금이 유효하지 않아요.")
	@Min(value = 0, message = "채용 보상금은 음수일 수 없습니다.")
	Long reward,

	@NotNull(message = "채용 공고의 내용이 유효하지 않아요.")
	String content,

	@NotNull(message = "채용 공고의 사용 기술이 유효하지 않아요.")
	String technology
) {
}
