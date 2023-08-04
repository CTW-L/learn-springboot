package com.example.demo.exception;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

/**
 * @author JianLuo
 * @create_date 2023/8/3 17:21
 */
@Data
@Builder
public class ExceptionData {

    @Singular
    private final List<Object> errors;

}
