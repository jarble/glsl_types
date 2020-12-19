function glsl_type($a){
	if(is_bool($a)){
		return "bool";
	}
	if(is_float($a)){
		return "float";
	}
	else if(is_array($a)){
		return glsl_type($a) . "[" . count($a) . "]";
	}
}
