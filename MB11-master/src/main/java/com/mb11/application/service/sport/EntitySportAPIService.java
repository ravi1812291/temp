package com.mb11.application.service.sport;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import com.mb11.application.config.RestTemplateConfig;
import com.mb11.application.model.cricapidata.MTeam;
import com.mb11.application.model.cricapidata.Match;
import com.mb11.application.model.cricapidata.Series;
import com.mb11.application.model.cricapidata.Sporttype;
import com.mb11.application.model.cricapidata.TeamPlayers;

import com.mb11.application.sport.helper.SportAPIHelper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Service
public class EntitySportAPIService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private SportAPIHelper apiHelper;

	private HttpHeaders headers;

	private HttpEntity entity;

	private ResponseEntity<String> response;

	private DateFormat formatter;

	private Date startdate;

	private Date enddate;

	private Long cid;

	private String competitionsUrl;

	public List<Series> getSeries(String year) throws JSONException, ParseException {

		competitionsUrl = apiHelper.getSeriesApi(year);

		StringBuilder baseUrl = RestTemplateConfig.getBaseURL();
		baseUrl.append("/" + competitionsUrl);
		baseUrl.append("?token=" + RestTemplateConfig.apiTocken);

		headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		entity = new HttpEntity(headers);

		response = restTemplate.exchange(baseUrl.toString(), HttpMethod.GET, entity, String.class);
		JSONObject myResponse = new JSONObject(response.getBody());

		System.out.println("Response is-----  " + myResponse);
		System.out.println();
		JSONArray jsonResults = myResponse.getJSONObject("response").getJSONArray("items");
		System.out.println("JSON ARRAY IS........ " + jsonResults);
		List<Series> lseries = new ArrayList<>();

		for (int i = 0; i < jsonResults.length(); i++) {
			formatter = new SimpleDateFormat("yyyy-MM-DD");
			startdate = (Date) formatter.parse(jsonResults.getJSONObject(i).getString("datestart"));
			enddate = (Date) formatter.parse(jsonResults.getJSONObject(i).getString("dateend"));
			Long cid = jsonResults.getJSONObject(i).getLong("cid");
			lseries.add(new Series(Long.toString(cid), jsonResults.getJSONObject(i).getString("title"),
					jsonResults.getJSONObject(i).getString("abbr"), jsonResults.getJSONObject(i).getString("category"),
					startdate, enddate, jsonResults.getJSONObject(i).getInt("total_matches"),
					jsonResults.getJSONObject(i).getInt("total_teams"), false));

		}

		return lseries;

	}

	

	public List<MTeam> getTeams(Long id) {

		competitionsUrl = apiHelper.getTeamsApi(id);

		StringBuilder baseUrl = RestTemplateConfig.getBaseURL();
		baseUrl.append("/" + competitionsUrl);
		baseUrl.append("?token=" + RestTemplateConfig.apiTocken);

		headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		entity = new HttpEntity(headers);

		response = restTemplate.exchange(baseUrl.toString(), HttpMethod.GET, entity, String.class);
		JSONObject myResponse = new JSONObject(response.getBody());

		System.out.println("Response is-----  " + myResponse);
		System.out.println();
		
		JSONArray jsonResults = myResponse.getJSONObject("response").getJSONArray("teams");
		System.out.println("JSON ARRAY IS........ " + jsonResults);
		List<MTeam> lteams = new ArrayList<>();

		for (int i = 0; i < jsonResults.length(); i++)
		{
			//public MTeam(Long teamid, String teamname, String teamabbr, String logo_url, String sex,
			//Sporttype sporttype,
				//	Set<Series> series)
			
			
			lteams.add(new MTeam(
					jsonResults.getJSONObject(i).getLong("tid"),
					jsonResults.getJSONObject(i).getString("title"),
					jsonResults.getJSONObject(i).getString("abbr"),
					jsonResults.getJSONObject(i).getString("logo_url"),
					jsonResults.getJSONObject(i).getString("sex"),
					Sporttype.Cricket,null
					
					));
			
		}
		
		return lteams;

	}

	public List<Match> getMatches(Long id) {

		competitionsUrl = apiHelper.getMatchesApi(id);

		StringBuilder baseUrl = RestTemplateConfig.getBaseURL();
		baseUrl.append("/" + competitionsUrl);
		baseUrl.append("?token=" + RestTemplateConfig.apiTocken);

		JSONObject jsonObject = restTemplate.getForObject(baseUrl.toString(), JSONObject.class);

		// System.out.println(jsonObject.toJSONString());

		return null;

	}

	public List<TeamPlayers> getTeamPlayers(Long id) {

		competitionsUrl = apiHelper.getPlayersApi(id);

		StringBuilder baseUrl = RestTemplateConfig.getBaseURL();
		baseUrl.append("/" + competitionsUrl);
		baseUrl.append("?token=" + RestTemplateConfig.apiTocken);

		JSONObject jsonObject = restTemplate.getForObject(baseUrl.toString(), JSONObject.class);

		// System.out.println(jsonObject.toJSONString());

		return null;

	}

}
