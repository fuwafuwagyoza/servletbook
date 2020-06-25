package tool;

import java.io.*;
import java.util.*;

public class Page {
	public static void header (PrintWriter out) {
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Servlet/JSP Sample Program</title>");
		out.println("</head>");
		out.println("<body>");
	}

	public static void footer (PrintWriter out) {
		out.println("</body>");
		out.println("</html>");
	}

	public static void cssheader (PrintWriter out) {
		out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
		out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ja\" lang=\"ja\">");
		out.println("<head>");
		out.println("<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />");
		out.println("<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />");
		out.println("<meta http-equiv=\"Content-Type\" charset=\"UTF-8\" />");
		out.println("<title>Servlet/JSP Samples</title>");
		out.println("<meta name=\"description\" content=\"\" />");
		out.println("<meta name=\"keywords\" content=\"\" />");
		out.println("<link rel=\"stylesheet\" href=\"../base.css\" type=\"text/css\" media=\"screen\" />");
		out.println("</head>");
		out.println("<body>");
		out.println("    <div id=\"wrapper\">");
		out.println("        <div id=\"header\">");
		out.println("            <div id=\"header-inner\">");
		out.println("            <!-- キーワード -->");
		out.println("            <h1>テスト購入サイト</h1>");
		out.println("            <!-- ページの概要 -->");
		out.println("            <p class=\"description\">てすとです</p>");
		out.println("            <!-- 企業名｜ショップ名｜タイトル -->");
		out.println("            <p class=\"logo\"><a href=\"index.html\">サンプル商事｜心斎橋東店｜テスト購入サイト</a></p>");
		out.println("            </div>");
		out.println("        </div>");
		out.println("    <!-- // header end -->");
		out.println("");
		out.println("        <div id=\"container\">");
		out.println("            <div id=\"contents\">");
		out.println("                <div id=\"contents-inner\">");
		out.println("                <!-- コンテンツここから -->");

	}

	public static void cssfooter (PrintWriter out) {
		out.println("                <!-- コンテンツここまで -->");
		out.println("                </div><!-- // contents-inner end -->");
		out.println("            </div><!-- // contents end -->");
		out.println("");
		out.println("            <div id=\"left-sidebar\">");
		out.println("            <!-- 左サイドバーここから -->");
		out.println("");
		out.println("            <p class=\"side-title\">作成済サンプル</p>");
		out.println("            <ul class=\"localnavi\">");
		out.println("            <li><a href=\"../html/char5_input.html\">char5_input.html</a></li>");
		out.println("            <li><a href=\"#\">*** リンク ***</a></li>");
		out.println("            <li><a href=\"#\">*** リンク ***</a></li>");
		out.println("            <li><a href=\"#\">*** リンク ***</a></li>");
		out.println("            <li><a href=\"#\">*** リンク ***</a></li>");
		out.println("            </ul>");
		out.println("");
		out.println("            <dl class=\"sidebar-dl\">");
		out.println("            <dt>更新履歴</dt>");
		out.println("            <dd>");
		out.println("            <p>2017/12/30 新規作成</p>");
		out.println("            </dd>");
		out.println("            </dl>");
		out.println("            <!--左サイドバーここまで-->");
		out.println("            </div><!-- // left-sidebar end -->");
		out.println("        </div><!-- // container end -->");
		out.println("");
		out.println("    <!-- ↓削除不可 -->");
		out.println("    <p id=\"cds\">Designed by <a href=\"http://www.css-designsample.com/\">CSS.Design Sample</a></p>");
		out.println("");
		out.println("    </div>");
		out.println("</body>");
		out.println("</html>");
	}
}
