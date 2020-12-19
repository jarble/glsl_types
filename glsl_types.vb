Public Class GLSL_types
    
    Public GLSL_type(a As Integer) As String
        Return "int"
    End Function
    
    Public GLSL_type(a As Double) As String
        Return "double"
    End Function
    
    Public GLSL_type(a As Boolean) As String
        Return "bool"
    End Function
End Class
