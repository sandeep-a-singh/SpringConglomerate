package com.sunny.apps.weather.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sunny.apps.weather.entity.City;

@Repository
interface CityDao extends JpaRepository<City, Long> {

}
