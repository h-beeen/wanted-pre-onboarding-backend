package kr.co.wanted.onboarding.recruitment.presentation;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.wanted.onboarding.recruitment.application.dto.request.RecruitmentRequest;
import lombok.RequiredArgsConstructor;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/recruitment")
public class RecruitmentController {

	@PostMapping
	public ResponseEntity<Void> registerRecruitment(
		@Validated @RequestBody RecruitmentRequest request
	) {

	}
}
