package prototype.type2;

import java.io.Serializable;

public class DeepProtoType implements Serializable,Cloneable {

    public String name;

    public DeepCloneTarget deepCloneTarget;  //引用类型

    public DeepProtoType() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        deep = super.clone();

        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneTarget = (DeepCloneTarget)deepCloneTarget.clone();
        
        return deepProtoType;
    }
}
