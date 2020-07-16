package com.mhts.springcloud.filter.post

import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import com.netflix.zuul.exception.ZuulException

import javax.servlet.http.HttpServletResponse

class PostFilter extends ZuulFilter {

    @Override
    String filterType() {
        return "post"
    }

    @Override
    int filterOrder() {
        return 2000
    }

    @Override
    boolean shouldFilter() {
        return true
    }

    @Override
    Object run() throws ZuulException {
        System.out.println("This is s post filter, Receive response");
        HttpServletResponse response = RequestContext.getCurrentContext().getResponse();
        response.getOutputStream().print(", I'm calling to you");
        response.flushBuffer();
    }

}
