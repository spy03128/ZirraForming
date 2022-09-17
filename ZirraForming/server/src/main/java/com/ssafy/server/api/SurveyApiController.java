package com.ssafy.server.api;

import com.ssafy.server.api.dto.SurveyResponse;
import com.ssafy.server.domain.repository.SurveyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class SurveyApiController {

    private final SurveyRepository surveyRepository;

    @GetMapping(value = "/survey", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<SurveyResponse>> getProblemList() {
        List<SurveyResponse> results = surveyRepository.findAll().stream().map(SurveyResponse::new).collect(Collectors.toList());
        return ResponseEntity.ok(results);
    }
}
