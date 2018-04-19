package com.altia.formacion.spring.ejemplowebmaven.data;

import java.util.List;

import com.altia.formacion.spring.ejemplowebmaven.Spittle;

public interface SpittleRepository {
	List<Spittle> findSpittles(long max, int count);
}
