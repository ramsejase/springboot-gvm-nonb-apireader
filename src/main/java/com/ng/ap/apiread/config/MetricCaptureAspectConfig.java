package com.ng.ap.apiread.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import lombok.extern.slf4j.Slf4j;

// @Slf4j
// @Aspect
// @Component
public class MetricCaptureAspectConfig //implements RuntimeHintsRegistrar 
{

	// @Around("@annotation(RecordTime)")
	// public Object recordTime(ProceedingJoinPoint joinPoint) throws Throwable {
		
	// 	StopWatch watch = new StopWatch("Metrics Logging");
	// 	watch.start();
	// 	Object proceed = joinPoint.proceed();
	// 	watch.stop();
	// 	log.info("{}:- Total Time taken {} seconds",
	// 			joinPoint.toLongString(),
	// 			watch.getTotalTimeSeconds());
	// 	return proceed;
	// }

	// @Override
	// public void registerHints(RuntimeHints arg0, @Nullable ClassLoader arg1) {}

	
}