package com.main.consolegame.game;

public class SlenderMan implements GamingConsole{
@Override
public void up() {System.out.println("Go Straight");}
public void down() {System.out.println("Go Back");}
public void left() {System.out.println("Turn left");}
public void right() {System.out.println("Turn right");}
}
