package com.example;

import com.example.cli.RootCommand;
import picocli.CommandLine;

public class Production {

	public static void main(String[] args) {
		var status =  new CommandLine(new RootCommand()).execute(args);
		System.exit(status);
	}
}
