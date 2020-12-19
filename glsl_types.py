def GLSL_type(a):
	if(isinstance(a, str)):
		return "int["+str(len(a))+"]"
	elif(isinstance(a, list)):
		return GLSL_type(a)+"["+str(len(a))+"]"
	elif(type(a) == bool):
		return "bool"
