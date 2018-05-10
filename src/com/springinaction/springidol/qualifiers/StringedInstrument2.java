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
@Qualifier  	//ע������һ��StringedInstrument�����𣬸�Qualifierʹ����inject��
public @interface StringedInstrument2 {

}
