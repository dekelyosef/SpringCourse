//package com.iis.annotations;
//
//import java.lang.reflect.Method;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.reflect.MethodSignature;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class LimitCallsAspect {
//
//	private Map<String,Integer> counters = new HashMap<String, Integer>();	
//	
//	@Around("@annotation(LimitCalls)")
//	public Object handleLimitation(ProceedingJoinPoint jp) throws Throwable
//	{
//		MethodSignature signature = (MethodSignature) jp.getSignature();
//		Method method = signature.getMethod();
//		if(method !=null)
//		{
//			if(!counters.containsKey(method.getName()))
//			{
//				counters.put(method.getName(), 0);
//			}
//			LimitCalls annotation = method.getAnnotation(LimitCalls.class);
//			Integer counter=counters.get(method.getName());
//			
//			if( annotation.limit()>counter)
//			{
//				counter++;
//				counters.put(method.getName(), counter);
//				return jp.proceed();
//			}
//			
//		}
//		throw new Exception("Max executions limit exceeded");
//	}
//}