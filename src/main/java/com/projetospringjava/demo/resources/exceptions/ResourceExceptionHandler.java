package com.projetospringjava.demo.resources.exceptions;

import com.projetospringjava.demo.service.exceptions.ResourceNotFoundExcpetion;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.catalina.connector.Request;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

import static org.aspectj.weaver.tools.cache.SimpleCacheFactory.path;

@ControllerAdvice
public class ResourceExceptionHandler {
      @ExceptionHandler(ResourceNotFoundExcpetion.class)
    public ResponseEntity<StandartError> resourceNotFound(ResourceNotFoundExcpetion e, HttpServletRequest request) {
         String error = "Resource not found";
          HttpStatus status = HttpStatus.NOT_FOUND;
          StandartError err = new StandartError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
          return ResponseEntity.status(status).body(err);
      }


}
