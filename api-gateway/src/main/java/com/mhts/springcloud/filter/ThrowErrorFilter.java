package com.mhts.springcloud.filter;

import com.netflix.zuul.ZuulFilter;
import org.springframework.stereotype.Component;

@Component
public class ThrowErrorFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("This is a pre filter, it will throw a RuntimeException");
//        try {
            throwAnException();
//        } catch (Exception e) {
//            ZuulException exception = new ZuulException(e,
//                    HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
//                    "errorCause: " + e.getMessage());
//            throw new ZuulRuntimeException(exception);
//        }
        return null;
    }

    private void throwAnException() {
        throw new RuntimeException("throwing an exception to test error filter");
    }
}
