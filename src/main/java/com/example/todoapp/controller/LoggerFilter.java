package com.example.todoapp.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Order(Ordered.HIGHEST_PRECEDENCE) // To samo co implementacja Ordered, HIGHEST_PRECEDENCE - wykona się przed wszystkimi
@Component
public class LoggerFilter implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(LoggerFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (servletRequest instanceof HttpServletRequest) {
            var httpRequest = (HttpServletRequest) servletRequest;
            logger.info("[doFilter]" + httpRequest.getMethod() + " " + httpRequest.getRequestURI());
        }

        filterChain.doFilter(servletRequest, servletResponse);
        logger.info("[doFilter] 2");
    }

}
