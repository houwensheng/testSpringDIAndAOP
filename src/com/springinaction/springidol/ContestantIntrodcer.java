package com.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * 通过标注引入
 * @author HR
 *
 */
@Component
@Aspect
public class ContestantIntrodcer {
	
	@DeclareParents(
			value="com.springinaction.springidol.Performer+",
			defaultImpl = GraciousContestant.class)
	public static Contestant contestant;
}
