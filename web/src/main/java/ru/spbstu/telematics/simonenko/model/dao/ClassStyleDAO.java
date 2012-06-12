package main.java.ru.spbstu.telematics.simonenko.model.dao;

import java.util.List;

import main.java.ru.spbstu.telematics.simonenko.model.dto.ClassStyleDTO;

public class ClassStyleDAO extends DAO<ClassStyleDTO> {
	
	public ClassStyleDTO get(Long id) {
		return get(ClassStyleDTO.class, id);
	}
	
	public List<ClassStyleDTO> getAll() {
		return getAll(ClassStyleDTO.class);
	}

}
