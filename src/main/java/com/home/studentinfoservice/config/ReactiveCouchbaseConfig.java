package com.home.studentinfoservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableReactiveCouchbaseRepositories;

@Configuration
@EnableReactiveCouchbaseRepositories
public class ReactiveCouchbaseConfig extends AbstractCouchbaseConfiguration {

	@Value("${spring.data.couchbase.bootstrap-hosts}")
    private String hostname;

    @Value("${spring.data.couchbase.bucket.name}")
    private String bucket;

    @Value("${spring.data.couchbase.bucket.password}")
    private String password;
	
	@Override
	public String getConnectionString() {
		return "couchbase://" + hostname;
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return "root";
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getBucketName() {
		// TODO Auto-generated method stub
		return bucket;
	}

}
