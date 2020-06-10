//package com.aust.clanguage.base.interceptor;
//
//
//import org.apache.commons.lang.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class ManagerAuthInterceptor extends HandlerInterceptorAdapter {
//
//    @Autowired
//    private SessionService sessionService;
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
//        String token = request.getHeader("x-auth-token");
//        if (StringUtils.isBlank(token)) {
//            errorResponse();
//            return false;
//        }
//        String managerId = sessionService.findManagerByToken(token);
//        if (StringUtils.isBlank(managerId)) {
//            errorResponse();
//            return false;
//        }
//        UserHolder.put(managerId);
//        return true;
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        UserHolder.clear();
//        super.afterCompletion(request, response, handler, ex);
//    }
//
//    private void errorResponse() {
//        throw new ErrorNotLoginException("");
//    }
//}
