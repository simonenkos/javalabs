package main.java.ru.spbstu.telematics.simonenko.model.dao;

import java.util.List;

import main.java.ru.spbstu.telematics.simonenko.model.dto.StyleDTO;

public class StyleDAO extends DAO<StyleDTO> {
	
	public StyleDTO get(Long id) {
		return get(StyleDTO.class, id);
	}
	
	public List<StyleDTO> getAll() {
		return getAll(StyleDTO.class);
	}
	
}
