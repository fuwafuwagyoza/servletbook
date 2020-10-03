package tool;

import java.io.*;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns={"/*"})
public class EncodingFilter implements Filter {
	public void doFilter (ServletRequest request, 
	ServletResponse response, FilterChain chain) 
	throws IOException, ServletException {
		/* 2020/08/24 CSSが効かなくなってしまうため、この設定をコメントアウト */
		// MIMEタイプ、文字コードの設定
		//response.setContentType("text/html; charset=UTF-8");
		/* 2020/08/24 CSSが効かなくなってしまうため、この設定をコメントアウト */
		/* 2020/10/04 上記削除で文字化けするためエンコーディング設定追加 */
		response.setCharacterEncoding("UTF-8");
		/* 2020/10/04 上記削除で文字化けするためエンコーディング設定追加 */
		request.setCharacterEncoding("UTF-8");
//		System.out.println("フィルタ前処理");

		// フィルタの実行
		chain.doFilter(request, response);
//		System.out.println("フィルタ後処理");

	}
	
	public void init(FilterConfig fc) {}
	public void destroy() {}
}
