package com.example.mvnprivate.main.rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;


/**
 * Rest 요청 결과를 담당하는 클래스
 */
public class ResponseRest  {

    /**
     * 400
     * @param request
     * @param message
     * @param object
     * @return
     */
    public static ResponseEntity getRestVoBadRequestError(HttpServletRequest request, String message, Object object){
        String path = request.getRequestURI();
        Timestamp timestamp =  new Timestamp(System.currentTimeMillis());
        RestVO restVO = new RestVO(timestamp.getTime(), HttpStatus.BAD_REQUEST.value(), message , HttpStatus.BAD_REQUEST.getReasonPhrase(), path);
        return  new ResponseEntity<RestVO>(restVO,HttpStatus.BAD_REQUEST);
    }

    /**
     * 200
     * @param request
     * @param message
     * @param object
     * @return
     */
    public static ResponseEntity getRestVoOKSuccess(HttpServletRequest request, String message, Object object){
        String path = request.getRequestURI();
        Timestamp timestamp =  new Timestamp(System.currentTimeMillis());
        RestVO restVO = new RestVO(timestamp.getTime(), HttpStatus.OK.value(), message , HttpStatus.OK.getReasonPhrase(), path , object);
        return  new ResponseEntity<RestVO>(restVO,HttpStatus.OK);
    }

    /**
     * 500
     * @param request
     * @param message
     * @param object
     * @return
     */
    public static ResponseEntity getRestVoServerError(HttpServletRequest request, String message){
        String path = request.getRequestURI();
        Timestamp timestamp =  new Timestamp(System.currentTimeMillis());
        RestVO restVO = new RestVO(timestamp.getTime(), HttpStatus.INTERNAL_SERVER_ERROR.value(), message , HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), path );
        return  new ResponseEntity<RestVO>(restVO,HttpStatus.OK);
    }
}
