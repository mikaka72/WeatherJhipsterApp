package com.mka.dao;

import java.util.List;

public interface WeatherApiDao <ENTITY, KEY> {

	ENTITY find(KEY key);
	
}
