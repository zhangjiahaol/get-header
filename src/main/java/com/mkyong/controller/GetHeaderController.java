package com.mkyong.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetHeaderController {
    
    @RequestMapping(value={"/", "/get-header"})
    public void getlistAllHeaders(@RequestHeader Map<String, String> headers,HttpServletRequest request, HttpServletResponse response) throws Exception {
    	headers.forEach((key, value) -> {
        	try {
				response.getWriter().write("\n" + key + ": " + value);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
    	});
    }
    
    @RequestMapping(value={"/", "/get-header/path1/path2/login/test1/test2"})
    public void testlogin1(@RequestHeader Map<String, String> headers,HttpServletRequest request, HttpServletResponse response) throws Exception {
    	headers.forEach((key, value) -> {
        	try {
				response.getWriter().write("\n" + key + ": " + value);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
    	});
    }
    
    @RequestMapping(value={"/", "/get-header/login/test1/test2"})
    public void testlogin2(@RequestHeader Map<String, String> headers,HttpServletRequest request, HttpServletResponse response) throws Exception {
    	headers.forEach((key, value) -> {
        	try {
				response.getWriter().write("\n" + key + ": " + value);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
    	});
    }

}