package com.example.cli;

import picocli.CommandLine;

@CommandLine.Command(mixinStandardHelpOptions = true)
public class RootCommand implements Runnable{
	@Override
	public void run() {
		System.out.println("Hello, world!");
	}
}
