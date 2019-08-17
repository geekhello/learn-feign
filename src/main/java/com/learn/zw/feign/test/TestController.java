package com.learn.zw.feign.test;

public class TestController {


    public static void main(String[] args) {

//        GitHubFeign git = Feign.builder().encoder(new GsonEncoder()).decoder(new GsonDecoder()).target(GitHubFeign.class, "https://api.github.com");
//        List<GitHubFeign.Contributor> contributors = git.contributors("OpenFeign", "feign");
//        if (contributors != null) {
//            contributors.stream().forEach(x -> System.out.println(x.getContributions() + "    " + x.getLogin()));
//        }
        System.out.println(sum(100));

    }

    public static int sum(int i) {
        if (i > 0) {
            return sum(i-1) + i;
        }
        return 0;
    }

}
