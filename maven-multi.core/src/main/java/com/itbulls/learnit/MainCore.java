package com.itbulls.learnit;

import org.apache.commons.lang3.ObjectUtils;

public class MainCore {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println(ObjectUtils.allNull(new Object()));
		MainPersistence.helloFromPersistenceModule();
	}
}
