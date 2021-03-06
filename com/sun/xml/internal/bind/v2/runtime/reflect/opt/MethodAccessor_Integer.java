/*    */ package com.sun.xml.internal.bind.v2.runtime.reflect.opt;
/*    */ 
/*    */ import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor;
/*    */ 
/*    */ public class MethodAccessor_Integer extends Accessor
/*    */ {
/*    */   public MethodAccessor_Integer()
/*    */   {
/* 40 */     super(Integer.class);
/*    */   }
/*    */ 
/*    */   public Object get(Object bean) {
/* 44 */     return Integer.valueOf(((Bean)bean).get_int());
/*    */   }
/*    */ 
/*    */   public void set(Object bean, Object value) {
/* 48 */     ((Bean)bean).set_int(value == null ? Const.default_value_int : ((Integer)value).intValue());
/*    */   }
/*    */ }

/* Location:           C:\Program Files\Java\jdk1.7.0_79\jre\lib\rt.jar
 * Qualified Name:     com.sun.xml.internal.bind.v2.runtime.reflect.opt.MethodAccessor_Integer
 * JD-Core Version:    0.6.2
 */