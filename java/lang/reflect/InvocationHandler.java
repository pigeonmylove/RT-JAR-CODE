package java.lang.reflect;

public abstract interface InvocationHandler {
    public abstract Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
            throws Throwable;
}

/* Location:           C:\Program Files\Java\jdk1.7.0_79\jre\lib\rt.jar
 * Qualified Name:     java.lang.reflect.InvocationHandler
 * JD-Core Version:    0.6.2
 */