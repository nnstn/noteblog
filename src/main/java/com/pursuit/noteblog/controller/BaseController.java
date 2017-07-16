package com.pursuit.noteblog.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.pursuit.noteblog.entity.User;
import com.pursuit.noteblog.service.UserService;
import com.pursuit.noteblog.web.i18n.LocaleMessageSourceUtil;

/**
 * 基类controller
 */
public class BaseController {
    protected final Logger logger = LoggerFactory.getLogger(getClass());
    
    protected UserService userService;
    @Autowired
    private LocaleMessageSourceUtil messageSourceUtil;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public User getUserInfo(HttpServletRequest request) {
    	//TODO  获取当前已登录用户信息
        return new User();
    }
    /**
     * 是否登录
     */
    public boolean hasLogin(HttpServletRequest request) {
    	return getUserInfo(request).getUid()!=null;
    }
    
    /**
     * 获取国际化信息
     * @param code
     * @return
     */
    public String getMessage(String code) {
        return messageSourceUtil.getMessage(code);
    }
    /**
     * 发送json消息
     *
     * @param response
     * @param message
     */
    public void sendMessage(HttpServletResponse response, String message) {
        response.reset();
        response.setContentType("application/X-JSON;charset=UTF-8");
        PrintWriter printWriter = null;
        try {
            printWriter = response.getWriter();
            printWriter.write(message);
        } catch (IOException e) {
            logger.error(ExceptionUtils.getFullStackTrace(e));
        } finally {
            if (printWriter != null) {
                printWriter.flush();
                printWriter.close();
            }
        }

    }

    /**
     * @param response
     * @param result
     */
    protected void write(HttpServletResponse response, String result) {
        try {
            response.setContentType("text/javascript");
            response.getWriter().print(result);
            response.getWriter().flush();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }
}