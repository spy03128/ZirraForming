package com.ssafy.server.api;

import com.ssafy.server.api.dto.survey.SurveyDto;
import com.ssafy.server.api.dto.survey.SurveyTestResultResponse;
import com.ssafy.server.domain.service.SurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class SurveyApiController {

    private final SurveyService surveyService;

    @GetMapping(value = "/survey", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<SurveyDto>> getProblemList() {
        List<SurveyDto> results = surveyService.findAll().stream().map(SurveyDto::new).collect(Collectors.toList());
        return ResponseEntity.ok(results);
    }

    @GetMapping(value = "/charactor", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SurveyTestResultResponse> getSurveyTestResult(@RequestParam(value = "name") String name) {
        SurveyTestResultResponse result = new SurveyTestResultResponse(surveyService.getSurveyTestResult(name));
        return ResponseEntity.ok(result);
    }

}
