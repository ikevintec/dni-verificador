package com.bootcamp.dniverificador.api;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
@AllArgsConstructor
public class Dni {

    public ResponseEntity<String> getDigit(@RequestParam String dni) {
        List<String> arrayNumbers = Collections.singletonList(Arrays.toString(dni.toCharArray()));
        return ResponseEntity.ok().body("");
    }

}
