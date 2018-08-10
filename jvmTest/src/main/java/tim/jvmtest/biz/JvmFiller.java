package tim.jvmtest.biz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

import tim.jvmtest.bean.ClassA;
import tim.jvmtest.bean.ClassB;
import tim.jvmtest.util.StringHelper;

public class JvmFiller {

	public static void main(String[] args) {
		List<ClassB> bList = new ArrayList<ClassB>(10);
		Map<String, ClassB> bMap = new HashMap<String, ClassB>(10);
		ClassB b = new ClassB();
		b.setIntegerP(1234567890);
		b.setFloatP(123456789012345678901234567890.123456f);
		b.setShortP((short)12345);
		b.setLongP(1234567890l);
		b.setDoubleP(123456789012345678901234567890.12345678901234567890);
		b.setBooleanP(true);
		b.setStringP("This is a test String.");
		
		for(int i = 0; i < 10; i++){
			try {
				bList.add(b.clone());
				bMap.put(StringHelper.BLANK + i, b.clone());
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		
		ClassA a = new ClassA(1, 1f, (short)1, 1l, 1d, 'c', (byte)'b', false);
		a.setListP(bList);
		a.setMapP(bMap);
		
		ExecutorService service = ThreadPoolExecutor.;
	}

}
