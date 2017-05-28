import javax.servlet.*;
import java.io.*;

public class MyFilter implements Filter
{
	public void init(FilterConfig fc) //throws ServletException
	{
	}
	public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("Before Servlet Execution");
		chain.doFilter(request,response);
		pw.println("After Servlet Execution");
	}
	public void destroy()
	{
	}
}