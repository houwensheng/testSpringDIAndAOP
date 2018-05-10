package com.springinaction.springidol.qualifiers;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Retention(RUNTIME)
@Target({ TYPE, FIELD, PARAMETER })
@Qualifier  	//注意与另一个StringedInstrument的区别，该Qualifier使用了inject包
public @interface StringedInstrument2 {

}
