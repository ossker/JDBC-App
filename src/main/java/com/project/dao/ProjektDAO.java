package com.project.dao;

import java.util.List;
import com.project.model.Projekt;

public interface ProjektDAO {
	Projekt getProjekt(Integer projektId);
	void setProjekt(Projekt projekt);
	void deleteProjekt(Integer projektId);
	List<Projekt> getProjekty(Integer offset, Integer limit);
	List<Projekt> searchByNazwa(String search4, Integer offset, Integer limit);
	Integer getIloscRekordow();
	List<Projekt> searchById(String search4, Integer offset, Integer limit);
	List<Projekt> searchByDate(String search4, Integer offset, Integer limit);
}
