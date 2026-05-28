package Nik.learning.__May.config;

import Nik.learning.__May.Movie;
import org.apache.logging.log4j.util.Cast;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
public class AppConfig {

    /*
    *
    <bean name="RRR" class="Nik.learning.__May.Movie" init-method="postInit" destroy-method="destroy">
        <constructor-arg name="id" value="1"></constructor-arg>
        <constructor-arg name="name" value="RRR"></constructor-arg>
        <constructor-arg name="year" value="2022"></constructor-arg>
        <constructor-arg name="genre" value="action"></constructor-arg>
        <constructor-arg name="cast">
            <list>
                <value>hero1</value>
                <value>hero2</value>
                <value>heroine</value>
            </list>
        </constructor-arg>
        <constructor-arg name="castSalary">
            <map>
                <entry key="hero1" value="150"></entry>
                <entry key="hero2" value="250"></entry>
                <entry key="heroine" value="350"></entry>
            </map>
        </constructor-arg>
    </bean>*/

    @Bean(initMethod = "postInit", destroyMethod = "destroy")
    public Movie RRR(){
        Movie movie = new Movie(1,"RRR", 2022, "action", List.of("hero1","hero2","heroine"), Map.of("hero1",150, "hero2",800,"heroine",500));
        return movie;
    }


}
