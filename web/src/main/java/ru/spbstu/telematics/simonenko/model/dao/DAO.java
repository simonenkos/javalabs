package main.java.ru.spbstu.telematics.simonenko.model.dao;

import java.util.List;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class DAO<Type> implements IDAO<Type> {

	private HibernateTemplate template;
	
	@Autowired
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	@Override
	@Transactional
	public void add(Type typeDTO) {
		template.save(typeDTO);
		template.flush();
	}

	@Override
	@Transactional
	public void update(Type typeDTO) {
		template.saveOrUpdate(typeDTO);
		template.flush();
	}

	@Override
	@Transactional
	public void delete(Type typeDTO) {
		template.delete(typeDTO);
		template.flush();
	}

	@Override
	@Transactional
	public Type get(Class<Type> clazz, Long id) {
		return (Type) template.get(clazz, id);
	}

	@Override
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Type> getAll(Class<Type> clazz) {
		Table tableAnnotation = 
				clazz.getAnnotation(Table.class);
		if(tableAnnotation != null) {
			return template.find("from " + tableAnnotation.name());
		}
		return null;
	}

}
