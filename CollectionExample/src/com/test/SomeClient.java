package com.test;

@FunctionalInterface
interface SomeInterface {
   abstract void transform(String someInput);
}

@FunctionalInterface
interface SomeInterface1  {
   abstract void transform(String someInput);
}

class SomeInterfaceImpl implements SomeInterface {

	@Override
	public void transform(String someInput) {
		// TODO Auto-generated method stub
		
	}
  
}
public class SomeClient {

}
