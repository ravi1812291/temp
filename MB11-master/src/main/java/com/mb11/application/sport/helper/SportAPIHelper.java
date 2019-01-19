package com.mb11.application.sport.helper;


import org.springframework.stereotype.Service;

@Service
public class SportAPIHelper {
	

	
	public String getSeriesApi(String yearsPeriod)
	{
		//https://rest.entitysport.com/v2/seasons/201617/competitions?token=ec471071441bb2ac538a0ff901abd249

	    //https://rest.entitysport.com/v2/seasons/2016/competitions?token=ec471071441bb2ac538a0ff901abd249
		
		return "/seasons/"+yearsPeriod.trim()+"/competitions";
	}
	
	public String getTeamsApi(Long id)
	{
		//https://rest.entitysport.com/v2/competitions/90534/teams?token=ec471071441bb2ac538a0ff901abd249
		return "/competitions/"+id+"/teams";
	}
	
	public String getMatchesApi(Long id)
	{
		//https://rest.entitysport.com/v2/competitions/90534/matches?token=ec471071441bb2ac538a0ff901abd249
				return "/competitions/"+id+"/matches";
	}
	
	public String getPlayersApi(Long id)
	{
		//https://rest.entitysport.com/v2/competitions/90534/squads?token=ec471071441bb2ac538a0ff901abd249
		return "/competitions/"+id+"/squads";
	}
	
	

}
