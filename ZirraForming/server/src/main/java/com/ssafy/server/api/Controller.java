package com.ssafy.server.api;

import com.ssafy.server.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final MemberRepository memberRepo;

    @GetMapping("/api")
    public String getUser() {
        System.out.println("getUser() 호출");
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());

        return "hello";
    }
}
