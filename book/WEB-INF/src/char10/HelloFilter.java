package char10;

import java.io.*;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloFilter implements Filter {
	public void doFilter (ServletRequest request, 
	ServletResponse response, FilterChain chain) 
	throws IOException, ServletException {
		System.out.println("[HelloFilter(pre)]");

		// フィルタの実行
		chain.doFilter(request, response);

		System.out.println("[HelloFilter(post)]");
	}
	
	public void init(FilterConfig fc) {}
	public void destroy() {}
}
