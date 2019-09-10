/**
 * 
 */
package concepts;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Bishwajit.
 *
 */
public class ReflectionConcepts {
	private String firstName;
	private int age;

	/**
	 * @param name
	 * @param age
	 */
	public ReflectionConcepts() {
		super();
		this.firstName = "Bishwajit";
		this.age = 28;
	}

	/**
	 * @param args
	 * @throws SecurityException
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws NoSuchMethodException
	 */
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException, NoSuchMethodException {
		// TODO Auto-generated method stub

		ReflectionConcepts reflectionConcepts = new ReflectionConcepts();
		Class cls = reflectionConcepts.getClass();

		System.out.println("Class Name      ::" + cls.getName());
		System.out.println("Canonical  Name ::" + cls.getCanonicalName());
		System.out.println("Simple Name     ::" + cls.getSimpleName());
		System.out.println("Modifiers       ::" + cls.getModifiers());
		System.out.println("package Name    ::" + cls.getPackageName());
		System.out.println("Type Name       ::" + cls.getTypeName());
		System.out.println("Super Class Name::" + cls.getSuperclass());

		Field[] fields = cls.getDeclaredFields();
		Field field = null;
		Object obj = null;
		for (Field f : fields) {
			System.out.println("Field Name      ::" + f.getName());
			
			field = cls.getDeclaredField(f.getName());
			obj = field.get(reflectionConcepts);
			System.out.println("Value           ::" + obj);

//			System.out.println("Modifiers Name  ::" + f.getModifiers());
		}
//		field.setAccessible(true);

//		Method[] methods = cls.getMethods();
//		for (Method m : methods) {
//			System.out.println("Method Name      ::" + m.getName());
//			System.out.println("Modifiers Name   ::" + m.getModifiers());
//			System.out.println("Default Value    ::" + m.getDefaultValue());
//		}
//		Method method = cls.getDeclaredMethod("getFirstName");
//		System.out.println(method.);
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
