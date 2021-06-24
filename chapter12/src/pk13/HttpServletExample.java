package pk13;

public class HttpServletExample {

	public static void method(HttpServlet HttpServlet) {
		HttpServlet.service();
	}
	
	public static void main(String[] args) {
		
		method(new LoginServlet());
		method(new FileDownloadServlet());

	}

}
