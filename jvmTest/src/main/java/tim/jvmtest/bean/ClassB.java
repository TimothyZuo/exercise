package tim.jvmtest.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassB implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3649324856688251853L;
	/*
	 * wrapper of basic type
	 */
	@NonNull private Integer integerP;
	@NonNull private Float floatP;
	@NonNull private Short shortP;
	@NonNull private Long longP;
	@NonNull private Double doubleP;
	@NonNull private Character charP;
	@NonNull private Byte byteP;
	@NonNull private Boolean booleanP;
	@NonNull private String stringP;
	
	public ClassB clone() throws CloneNotSupportedException {
		ClassB newB = (ClassB) super.clone();
		return newB;
	}
}
