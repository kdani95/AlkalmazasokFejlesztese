package hu.elte.keza.issuetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class IssueTrackerApplication extends WebMvcConfigurerAdapter 
{
    public static void main(String[] args)
    {
        SpringApplication.run(IssueTrackerApplication.class, args);
    }
}
