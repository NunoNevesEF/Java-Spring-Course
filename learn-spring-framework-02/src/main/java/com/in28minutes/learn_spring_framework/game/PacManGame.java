package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacManGame implements GamingConsole{

	public void up() {
		System.out.println("Go Up");
		
	}

	public void down() {
		System.out.println("Go Down");
		
	}

	public void left() {
		System.out.println("Go Left");
		
	}

	public void right() {
		System.out.println("Go Right");
		
	}
}
