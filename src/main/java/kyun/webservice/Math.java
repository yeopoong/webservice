package kyun.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Math {
	@WebMethod
	public long sum(long a, long b);
}