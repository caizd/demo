package cn.caizhongdong.numberofsteps.rest.resource;


import cn.caizhongdong.numberofsteps.domain.User;
import cn.caizhongdong.numberofsteps.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import javax.annotation.security.PermitAll;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

@Controller
@Path("/samples/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SampleResource {
    private static final Log log = LogFactory.getLog(SampleResource.class);

    private @Value("${fileFolder}")
    String fileFolder;

    @Autowired
    private UserService userService;

    /**
     * 如果方法需要获取当前用户，从SecurityContext中获取
     *
     * @param req
     * @param sc
     * @return
     */
    @PermitAll
    @GET
    @Path("/hello")
    public User sayHello(@Context HttpServletRequest req, @Context SecurityContext sc) {
        User user = userService.retrieveOrder(1);

        return user;
    }
}
