package com.raju.weather.openWeather.model;

import lombok.Data;

@Data
public class Main {
	private double temp;
	private double feels_like;
	private double temp_min;
	private double temp_max;
	private int pressure;
	private int humidity;
	private int sea_level;
	private int grnd_level;

}
