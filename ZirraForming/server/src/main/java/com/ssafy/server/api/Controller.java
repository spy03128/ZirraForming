package com.ssafy.server.api;

import com.ssafy.server.domain.entity.Member;
import com.ssafy.server.domain.repository.MemberRepo;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final MemberRepo memberRepo;

    @GetMapping("/api")
    public String getUser() {
        System.out.println("getUser() 호출");
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());

        return "hello";
    }
}
