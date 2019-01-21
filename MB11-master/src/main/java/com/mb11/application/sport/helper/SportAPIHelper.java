package com.mb11.application.sport.helper;


import org.springframework.stereotype.Service;

import com.mb11.application.config.RestTemplateConfig;

@Service
public class SportAPIHelper {
	
	private String competitionsUrl;
	
	public String getSeriesApi(String yearsPeriod)
	{
		//https://rest.entitysport.com/v2/seasons/201617/competitions?token=

	    //https://rest.entitysport.com/v2/seasons/2016/competitions?token=
		competitionsUrl="/seasons/"+yearsPeriod.trim()+"/competitions";
		
		StringBuilder baseUrl = RestTemplateConfig.getBaseURL();
		baseUrl.append("/" + competitionsUrl);
		baseUrl.append("?token=" + RestTemplateConfig.apiTocken);
		
		return baseUrl.toString();
	}
	
	public String getTeamsApi(Long id)
	{
		//https://rest.entitysport.com/v2/competitions/90534/teams?token=
		competitionsUrl="/competitions/"+id+"/teams";
		
		StringBuilder baseUrl = RestTemplateConfig.getBaseURL();
		baseUrl.append("/" + competitionsUrl);
		baseUrl.append("?token=" + RestTemplateConfig.apiTocken);
		
		return baseUrl.toString();
	}
	
	public String getMatchesApi(Long id)
	{
		//https://rest.entitysport.com/v2/competitions/90534/matches?token=
		competitionsUrl= "/competitions/"+id+"/matches";
		StringBuilder baseUrl = RestTemplateConfig.getBaseURL();
		baseUrl.append("/" + competitionsUrl);
		baseUrl.append("?token=" + RestTemplateConfig.apiTocken);
		
		return baseUrl.toString();
				
				
	}
	
	public String getPlayersApi(Long id)
	{
		//https://rest.entitysport.com/v2/competitions/90534/squads?token=
		competitionsUrl= "/competitions/"+id+"/squads";
		
		StringBuilder baseUrl = RestTemplateConfig.getBaseURL();
		baseUrl.append("/" + competitionsUrl);
		baseUrl.append("?token=" + RestTemplateConfig.apiTocken);
		
		return baseUrl.toString();
	}
	
	public String getPlayerInfo(Long player_id)
	{
		//https://rest.entitysport.com/v2/players/119?token=
		competitionsUrl= "/players/"+player_id;
		
		StringBuilder baseUrl = RestTemplateConfig.getBaseURL();
		baseUrl.append("/" + competitionsUrl);
		baseUrl.append("?token=" + RestTemplateConfig.apiTocken);
		
		return baseUrl.toString();
	}
	
	

}
