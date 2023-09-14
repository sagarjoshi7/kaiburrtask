package com.kaiburr.task1;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/")
public class ServerHandling {
	private static String name,language,framework;
	private static int id;
	
	@GET @Path("/Servin") @Produces("application/json")
	public String display(String name, int id, String languauge, String framework) {
		String dispStyle="\n{\name: \"%s\",\nid: \"%s\",\nlanguage: \"%s\",\nframework: \"%s\"\n}";
		return String.format(dispStyle, name,id,language,framework);
	}
	
	@PUT @Path("/Enterr") @Produces("application/json")
	public void updateServer(@QueryParam("name") String name, @QueryParam("id") int id, @QueryParam("language") String languauge, @QueryParam("framework") String framework) {
		ServerHandling.name=name;
		ServerHandling.id=id;
		ServerHandling.language=language;
		ServerHandling.framework=framework;
		display(name,id,language,framework);
	}
	
	@POST @Path("/dispServerName") @Produces("text/plain")
	public String dispName() {
		return name;
	}
	@POST @Path("/dispServerID") @Produces("text/plain")
	public int dispID() {
		return id;
	}
	@POST @Path("/dispServerLang") @Produces("text/plain")
	public String dispLang() {
		return language;
	}
	@POST @Path("/dispServerFrame") @Produces("text/plain")
	public String dispFrame() {
		return framework;
	}
	
	public String getName() {
		return name;
	}
	public int getID() {
		return id;
	}
	public String getLang() {
		return language;
	}
	public String getFrame() {
		return framework;
	}
}
