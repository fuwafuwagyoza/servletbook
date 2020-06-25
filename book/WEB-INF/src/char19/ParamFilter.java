package char19;

import tool.Page;
import java.io.*;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ParamFilter implements Filter {
    
    private String message;
    
    public void init(FilterConfig config) throws ServletException {
        message = config.getInitParameter("message");
    }

    public void doFilter (ServletRequest request, ServletResponse response,
    FilterChain chain) throws ServletException, IOException {
		// MIMEタイプ、文字コードの設定
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        
        Page.cssheader(out);
        
        out.println(message);

        Page.cssfooter(out);
        chain.doFilter(request, response);
            
    }
    
    public void destroy() {}

}
