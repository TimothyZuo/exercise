package tim.jvmtest.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassA implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1812507758096206869L;
	
	/*
	 * basic type
	 */
	private int intP;
	private float floatP;
	private short shortP;
	private long longP;
	private double doubleP;
	private char charP;
	private byte byteP;
	private boolean booleanP;
	
	/*
	 * collection and map
	 */
	@NonNull private List<ClassB> listP;
	@NonNull private Map<String, ClassB> mapP;
	
	public ClassA(int intP, float floatP, short shortP, long longP
			, double doubleP, char charP, byte byteP, boolean booleanP){
		this.intP = intP;
		this.floatP = floatP;
		this.longP = longP;
		this.doubleP = doubleP;
		this.charP = charP;
		this.byteP = byteP;
		this.booleanP = booleanP;
	}
}
