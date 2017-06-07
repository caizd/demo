package cn.caizhongdong.numberofsteps.rest.resource;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import javax.annotation.security.PermitAll;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;
import java.util.HashMap;
import java.util.Map;

@Controller
@Path("/samples/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SampleResource {
	private static final Log log = LogFactory.getLog(SampleResource.class);

	private @Value("${fileFolder}") String fileFolder;

	/**
	 * 如果方法需要获取当前用户，从SecurityContext中获取
	 * @param req
	 * @param sc
	 * @return
	 */
	@PermitAll
	@GET
	@Path("/hello")
	public Map<String, Object> sayHello(@Context HttpServletRequest req, @Context SecurityContext sc) {
//		if (log.isTraceEnabled()) {
//			log.trace("sayHello() " + this);
//
//			if(req != null){
//				log.trace("reqest " + (req.getUserPrincipal() == null ? " user from req is null " : req.getUserPrincipal().getName()));
//			}
//			if(sc != null){
//				log.trace("SC " + sc.getAuthenticationScheme() + ", " + (sc.getUserPrincipal() == null ? "user is null" : sc.getUserPrincipal().getName() ));
//			}
//		}
		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("hello", "Hello, world.");
		return result;
	}
}
