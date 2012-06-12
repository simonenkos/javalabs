package main.java.ru.spbstu.telematics.simonenko.model.dao;

import java.util.List;

import main.java.ru.spbstu.telematics.simonenko.model.dto.FamilyDTO;

public class FamilyDAO extends DAO<FamilyDTO> {

	public FamilyDTO get(Long id) {
		return get(FamilyDTO.class, id);
	}
	
	public List<FamilyDTO> getAll() {
		return getAll(FamilyDTO.class);
	}
}
