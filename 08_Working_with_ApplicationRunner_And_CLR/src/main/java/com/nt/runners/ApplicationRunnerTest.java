package com.nt.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component("art")
public class ApplicationRunnerTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ApplicationRunner class Test");
		System.out.println("ApplicationRunner ages are::");
		System.out.println("Non option args are(only values)::"+args.getNonOptionArgs());
		System.out.println("OPtion args are (keys and value)::"+args.getOptionNames());
		System.out.println("Get only values who's key is aahar::"+args.getOptionValues("aadhar"));
		System.out.println("Get only values who's key is voterid::"+args.getOptionValues("voterid"));
		System.out.println("Get only values who's key is pan::"+args.getOptionValues("pan"));
		System.out.println("****************End of applicationRunner class*************");

	}

}
