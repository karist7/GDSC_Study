package com.example.gdsc.Controller;

import com.example.gdsc.Dto.MemberDto;
import com.example.gdsc.service.WebClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web-client")
public class WebClientController {
    private final WebClientService webClientService;

    public WebClientController(WebClientService webClientService) {
        this.webClientService = webClientService;
    }

    @GetMapping("/parameter")
    public String getNameWithParameter2(){
        return webClientService.getNameWithParameter();
    }
    @PostMapping("/header")
    public ResponseEntity<MemberDto> postWithHeader(){
        return webClientService.postWithHeader();
    }
}
