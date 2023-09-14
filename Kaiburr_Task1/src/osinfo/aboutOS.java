package osinfo;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/osinfo")
public class aboutOS {
	@GET 
	@Produces(MediaType.TEXT_XML)
	@Path("{name}")
	public String hi(@PathParam("name") String name) {
		String resp="<?xml version='1.0"+"<hello>XML "+name+"</hello>";
		return resp;
	}
	
	@GET 
	@Produces(MediaType.TEXT_HTML)
	@Path("{name}")
	public String hiHtml(@PathParam("name") String name) {
		String resp="<h1>HTML"+name+"</h1>";
		return resp;
	}
}
