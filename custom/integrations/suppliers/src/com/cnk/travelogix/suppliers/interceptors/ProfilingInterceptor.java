/**
 * @author I077988
 */
package com.cnk.travelogix.suppliers.interceptors;

import de.hybris.platform.util.StopWatch;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author I077988
 *
 */
@Aspect
public class ProfilingInterceptor {

    //@Around("execution(* com.cnk.travelogix.suppliers.client.SupplierClient.*(..))")
    @Around("(execution(* com.cnk.travelogix.suppliers.air.service.SupplierAirService.*(..)) "
    	+ "|| execution(* com.cnk.travelogix.suppliers.acco.service.SupplierAccoService.*(..))"
    	+ "|| execution(* com.cnk.travelogix.suppliers.client.SupplierClient.*(..)))")
    public Object doBasicProfiling(ProceedingJoinPoint joinPoint) throws Throwable {
	final StopWatch sw = new StopWatch(joinPoint.toShortString());
	try {
	    return joinPoint.proceed();
	} finally {
	    sw.stop();
	}
    }
}
