package com.mb11.application.service.sport;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mb11.application.config.RestTemplateConfig;
import com.mb11.application.model.cricapidata.MTeam;
import com.mb11.application.model.cricapidata.Match;
import com.mb11.application.model.cricapidata.TeamPlayers;
import com.mb11.application.payload.admin.sport.Series;
import com.mb11.application.sport.helper.SportAPIHelper;

import net.minidev.json.JSONObject;

@Service
public class EntitySportAPIService {

	@Autowired
    RestTemplate restTemplate;
	
	@Autowired
	SportAPIHelper apiHelper;
	
	private String competitionsUrl;

	public List<Series> getSeries(String year) {
		
		competitionsUrl=apiHelper.getSeriesApi(year);
		
		StringBuilder baseUrl = RestTemplateConfig.getBaseURL();
		baseUrl.append("/"+competitionsUrl);
		baseUrl.append("?token="+RestTemplateConfig.apiTocken);
		
		JSONObject jsonObject = restTemplate.getForObject(baseUrl.toString(), JSONObject.class);
		
		System.out.println(jsonObject.toJSONString());
		
		return null;
		
	}
	
public List<MTeam> getTeams(Long id) {
		
		competitionsUrl=apiHelper.getTeamsApi(1L);
		
		StringBuilder baseUrl = RestTemplateConfig.getBaseURL();
		baseUrl.append("/"+competitionsUrl);
		baseUrl.append("?token="+RestTemplateConfig.apiTocken);
		
		JSONObject jsonObject = restTemplate.getForObject(baseUrl.toString(), JSONObject.class);
		
		System.out.println(jsonObject.toJSONString());
		
		return null;
		
	}

public List<Match> getMatches(Long id) {
	
	competitionsUrl=apiHelper.getMatchesApi(id);
	
	StringBuilder baseUrl = RestTemplateConfig.getBaseURL();
	baseUrl.append("/"+competitionsUrl);
	baseUrl.append("?token="+RestTemplateConfig.apiTocken);
	
	JSONObject jsonObject = restTemplate.getForObject(baseUrl.toString(), JSONObject.class);
	
	System.out.println(jsonObject.toJSONString());
	
	return null;
	
}

public List<TeamPlayers> getTeamPlayers(Long id) {
	
	competitionsUrl=apiHelper.getPlayersApi(id);
	
	StringBuilder baseUrl = RestTemplateConfig.getBaseURL();
	baseUrl.append("/"+competitionsUrl);
	baseUrl.append("?token="+RestTemplateConfig.apiTocken);
	
	JSONObject jsonObject = restTemplate.getForObject(baseUrl.toString(), JSONObject.class);
	
	System.out.println(jsonObject.toJSONString());
	
	return null;
	
}




}
