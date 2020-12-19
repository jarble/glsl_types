public class GLSL_types{
	public static String GLSL_type(int a){
		return "int";
	}
	public static String GLSL_type(double a){
		return "double";
	}
	public static String GLSL_type(bool a){
		return "bool";
	}
	public static String GLSL_type(bool[] a){
		return "bool["+String.valueOf(a.length)+"]";
	}
}
