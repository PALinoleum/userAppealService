package pal.appeal.userappealservice.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@Configuration
@EnableJdbcRepositories(basePackages = {"pal.appeal.userappealservice"})
@EntityScan(basePackages = {"pal/appeal/userappealservice/dao"})
public class JdbcConfig extends AbstractJdbcConfiguration {

//    @Bean
//    public DataSource getDataSource() {
//        DataSourceBuilder<> dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName("org.h2.Driver");
//        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/request_db");
//        dataSourceBuilder.username("postgre");
//        dataSourceBuilder.password("nF45Nfa9");
//        return dataSourceBuilder.build();
//    }
}

//@Configuration
//@EnableJdbcRepositories
//public class JdbcConfig extends AbstractJdbcConfiguration {
//
//    @Autowired
//    private DataSource source;
//}
