package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {
	
	
	public static int HEALTH = 100;
	private int greenValue = 255;
	
	private double score = 0;
	private int level = 1;
	
	public void tick() {
		HEALTH = (int) Game.clamp(HEALTH, 0, 100);
		greenValue = (int) Game.clamp(greenValue, 0, 255);
		
		greenValue = HEALTH * 2;
		
		score = score + .05;
	}
	
	public void render(Graphics g) {
		g.setColor(Color.gray);    //Creates grey underneath green health bar
		g.fillRect(15, 15, 100, 10);
		
		g.setColor(new Color(120, greenValue, 0));  //Creates the actual health in green
		g.fillRect(15, 15, HEALTH, 10);
		
		g.setColor(Color.white);   //Creates a white boarder around the health bar
		g.drawRect(15, 15, 100, 10);
		
		g.drawString("Score: " + (Math.round(score*1)/1), 10, 40);
		g.drawString("Level: " + level, 10, 50);
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public double getScore() {
		return score;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}

}
