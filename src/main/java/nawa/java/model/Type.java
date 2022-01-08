package nawa.java.model;

import java.util.List;

public interface Type {
    
    public boolean isPrimitive();
    
    public boolean isRefence();
    
    public String name();
    
    public String fullyQualifiedName();
    
    public List<TypeParameter> typeParameters();
    
}
