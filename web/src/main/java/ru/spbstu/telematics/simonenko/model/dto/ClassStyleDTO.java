package main.java.ru.spbstu.telematics.simonenko.model.dto;

import javax.persistence.*;

@Entity
@Table(name = "T_CLASS_STYLE")
public class ClassStyleDTO {

	@Column(name = "class_id")
	private Long classId;
	
	@Column(name = "style_id")
	private Long styleId;

	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Long getStyleId() {
		return styleId;
	}

	public void setStyleId(Long styleId) {
		this.styleId = styleId;
	}
	
}
