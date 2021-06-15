package com.neophyte.jhipster.microapp1.web.rest;

import com.neophyte.jhipster.microapp1.security.AuthoritiesConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MicroAppResource {

    @GetMapping("/getHelloMsg")
    @PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.API_USER + "\")")
    //@PreAuthorize("hasAnyAuthority(\"" + AuthoritiesConstants.ADMIN + "\", \"" + AuthoritiesConstants.API_USER + "\")")
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>("Hello there", HttpStatus.OK);
    }
}
