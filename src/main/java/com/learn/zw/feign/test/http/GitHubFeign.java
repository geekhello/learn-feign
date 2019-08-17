package com.learn.zw.feign.test.http;

import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface GitHubFeign {

    @RequestLine("GET /repos/{owner}/{repo}/contributors")
    List<Contributor> contributors(@Param("owner") String owner, @Param("repo") String repository);

    class Contributor {
        String login;
        int contributions;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public int getContributions() {
            return contributions;
        }

        public void setContributions(int contributions) {
            this.contributions = contributions;
        }
    }
}
