package example;

import com.codahale.metrics.annotation.Timed;
import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

@Path("/filter")
@Produces(MediaType.APPLICATION_JSON)
public class FilterResource {

  FilterDao dao;

  final int BUILD = 1;
  final int LANG = 2;
  final int PLATFORM = 3;
  final int TECH = 4;

  public FilterResource(FilterDao dao){ this.dao = dao;}

  @Path("/lang")
  @GET
  @Timed
  @UnitOfWork
  public List<Filter> getLang() {
      return dao.findByType(LANG);
  }

  @Path("/platform")
  @GET
  @Timed
  @UnitOfWork
  public List<Filter> getPlatform() {
      return dao.findByType(PLATFORM);
  }

  @Path("/build")
  @GET
  @Timed
  @UnitOfWork
  public List<Filter> getBuild() {
      return dao.findByType(BUILD);
  }

  @Path("/tech")
  @GET
  @Timed
  @UnitOfWork
  public List<Filter> getTech() {
      return dao.findByType(TECH);
  }
}
