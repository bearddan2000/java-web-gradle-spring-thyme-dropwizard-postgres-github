package example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import example.model.filter.BuildFilter;
import example.model.filter.LangFilter;
import example.model.filter.PlatformFilter;
import example.model.filter.TechFilter;

@RestController
@RequestMapping("/api")
public class DropwizardRestController {

	private final RestTemplate template = new RestTemplate();

	private final String API_URL = "http://api:8080/";

	@RequestMapping(path="/filter/build", method=RequestMethod.GET)
	public List<BuildFilter> getAllBuildApi() {
		return template.getForObject(API_URL + "filter/build", List.class);
	}

	@RequestMapping(path="/filter/lang", method=RequestMethod.GET)
	public List<LangFilter> getAllLangApi(){
		return template.getForObject(API_URL + "filter/lang", List.class);
	}

	@RequestMapping(path="/filter/platform", method=RequestMethod.GET)
	public List<PlatformFilter> getAllPlatformApi(){
		return template.getForObject(API_URL + "filter/platform", List.class);
	}

	@RequestMapping(path="/filter/tech", method=RequestMethod.GET)
	public List<TechFilter> getAllTechApi(){
		return template.getForObject(API_URL + "filter/tech", List.class);
	}

}
