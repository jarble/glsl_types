#include <iostream>
using namespace std;
class GLSL_types{ public:
    
    std::string GLSL_type(int a){
        return "int";
    }
    
    std::string GLSL_type(double a){
        return "double";
    }
    
    std::string GLSL_type(bool a){
        return "bool";
    }
};
